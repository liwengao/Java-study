package JAVAlangueage;
import java.text.DecimalFormat;
import java.util.Scanner;
public class instance1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //让用户输入身高，体重，年龄，性别，活动等级
        System.out.print("请输入身高(cm)：");
        double height = scanner.nextDouble();
        System.out.print("请输入体重(kg)：");
        double weight = scanner.nextDouble();
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        System.out.print("请输入性别(0-男/1-女)：");
        int gender = scanner.nextInt();
        System.out.println("请输入日常活动等级：0-久坐，1-轻度活动，2-中度活动，3-重度活动");
        byte activityLevel = scanner.nextByte();
        String bodyType;
        //计算BMI
        double bmi = weight / ((height * height)*0.0001);
        //判断体型
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
        //运动目标
        String fitnessGoal;
        if(bodyType.equals("偏瘦"))
        {
            fitnessGoal = "增重";
        }
        else if(bodyType.equals("正常"))
        {
            fitnessGoal = "维持";
        }
        else if(bodyType.equals("偏胖"))
        {
            fitnessGoal = "减重";
        }
        else
        {
            fitnessGoal = "减重";
        }
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("您的BMI值为："+df.format(bmi) + "，体型为：" + bodyType + "，运动目标为：" + fitnessGoal);
        //计算每日摄入的营养
        //计算BMR
        double bmr;
        if(gender == 0)
        {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        }
        else
        {
            bmr = 65 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }
        //计算tdee
       double activityFactor;
        if(activityLevel == 0)
        {
            activityFactor = 1.2;
        }else if(activityLevel == 1){
            activityFactor = 1.375;
        }else if(activityLevel == 2){
            activityFactor = 1.55;
        }else {
            activityFactor = 1.725;
        }

        //计算没日摄入热量
        double dailyCalories=  bmr * activityFactor;;
        if(fitnessGoal.equals("增重"))
        {
            dailyCalories += 500;
        }else if(fitnessGoal.equals("维持"))
        {
            dailyCalories += 0;
        }else {
            dailyCalories -= 500;
        }
        //计算没人摄入的营养素质量
        double protein = dailyCalories * 0.25 / 4;
        double carbohydrates = dailyCalories * 0.5 / 4;
        double fat = dailyCalories * 0.25 / 9;
        //打印结果 分布打印
        System.out.println("您的每日摄入热量为："+df.format(dailyCalories));
        System.out.println("您的每日摄入蛋白质为："+df.format(protein) + "g");
        System.out.println("您的每日摄入碳水化合物为："+df.format(carbohydrates) + "g");
        System.out.println("您的每日摄入脂肪为："+df.format(fat) + "g");
    }
}
