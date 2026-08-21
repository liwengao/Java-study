package basicLanguage;
import java.util.Scanner;
public class Text3_Scanner {
    static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner =new Scanner(System.in);
        //录入对象
        System.out.println("请输入一个整数：");
        int a=scanner.nextInt();
        System.out.println("你输入的整数是："+a);

        //录入小数
        System.out.println("请输入一个小数：");
        double num2=scanner.nextDouble();
        System.out.println("你输入的小数是："+num2);
    }
}
