import java.text.DecimalFormat;
import java.util.Scanner;
public class Insant1_Healthy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.让用户输入身高，体重，年龄，性别，活动等级
        double height = readValue("请输入身高(cm)", 100, 220);
        double weight = readValue("请输入体重(kg)", 40, 200);
        int age = (int)readValue("请输入年龄", 0, 120);
        int gender = (int)readValue("请输入性别(0-男/1-女)", 0, 1);
        byte activityLevel = (byte)readValue("请输入日常活动等级", 0, 3);
        String bodyType;
        //2.计算BMI
        double bmi = weight / ((height * height)*0.0001);
        //3.判断体型
        bodyType = getBodyType(bmi);
        //运动目标
        String fitnessGoal;
        fitnessGoal = getFitnessGoal(bodyType);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("您的BMI值为："+df.format(bmi) + "，体型为：" + bodyType + "，运动目标为：" + fitnessGoal);
        //5.计算BMR
        double bmr = getBmr(gender, weight, height, age);
        //计算tdee
        double activityFactor = getActivityFactor(activityLevel);
        //6.计算没日摄入热量
        double dailyCalories=  bmr * activityFactor;;
        dailyCalories = getDailyCalories(fitnessGoal, dailyCalories);
        //计算没人摄入的营养素质量
        double protein = dailyCalories * 0.25 / 4;
        double carbohydrates = dailyCalories * 0.5 / 4;
        double fat = dailyCalories * 0.25 / 9;
        //打印结果 分布打印
        printResult(df, dailyCalories, protein, carbohydrates, fat);
    }

    private static double getBmr(int gender, double weight, double height, int age) {
        double bmr= gender ==0?
                66 + (13.7 * weight) + (5 * height) - (6.8 * age):
                65 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        return bmr;
    }

    private static String getBodyType(double bmi) {
        String bodyType;
        if(bmi < 18.5)
        {
            bodyType = "偏瘦";
        }else  if (bmi >= 18.5 && bmi < 24.9){
            bodyType = "正常";
        }else if (bmi >= 24.9 && bmi < 29.9){
            bodyType = "偏胖";
        }else {
            bodyType = "肥胖";
        }
        return bodyType;
    }

    private static String getFitnessGoal(String bodyType) {
        String fitnessGoal;
        switch (bodyType)
        {
            case "偏瘦" -> fitnessGoal = "增重";
            case "正常" -> fitnessGoal = "维持";
            case "偏胖" -> fitnessGoal = "减重";
            default -> fitnessGoal = "减重";
        }
        return fitnessGoal;
    }

    private static double getActivityFactor(byte activityLevel) {
        double activityFactor=switch (activityLevel)
        {
            case 0 -> 1.2;
            case 1 -> 1.375;
            case 2 -> 1.55;
            case 3 -> 1.725;
            default -> 0;
        };
        return activityFactor;
    }

    private static double getDailyCalories(String fitnessGoal, double dailyCalories) {
        switch (fitnessGoal)
        {
            case "增重" -> dailyCalories += 500;
            case "维持" -> dailyCalories += 0;
            case "减重" -> dailyCalories -= 500;

        }
        return dailyCalories;
    }

    static void printResult(DecimalFormat df, double dailyCalories, double protein, double carbohydrates, double fat) {
        System.out.println("您的每日摄入热量为："+ df.format(dailyCalories));
        System.out.println("您的每日摄入蛋白质为："+ df.format(protein) + "g");
        System.out.println("您的每日摄入碳水化合物为："+ df.format(carbohydrates) + "g");
        System.out.println("您的每日摄入脂肪为："+ df.format(fat) + "g");
    }
    static double readValue(String prompt,double min,double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print("请输入"+prompt+":");
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("输入错误,请输入"+min+"到"+max+"之间的数");
        }
        return value;
    }
}
