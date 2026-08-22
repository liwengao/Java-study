package chap04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StaticFactoryMethodDemo2 {
    static void main(String[] args) {
        Gender male1=Gender.male();
//        Gender male2=Gender.male();
        Gender female1=Gender.female();
//        Gender female2=Gender.female();
        //1.重复创建对象，蓝菲内存
        //Gender male=new Gender(0,"男");
        //Gender female=new Gender(1,"女");

        //2.对象随意创建，出现错误
//       " Gender other=new Gender(2,"其他")"
        //3.数字标识与性别的关联不强
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的性别0-男，1-女：");
        int value =sc.nextInt();
        Gender gender=Gender.valueOf(value);
        System.out.println("你的性别是："+gender.getLabel());

    }
}
