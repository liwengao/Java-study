package chap01;

public class ObjectDemo {
    static void main(String[] args) {
        //1. 创建对象
        Girl girl1 = new Girl();
        //2.给对象赋值
        girl1.name = "小丽";
        girl1.height = 165;
        girl1.weight = 50;
        System.out.println(girl1.name);
        System.out.println(girl1.height);
        System.out.println(girl1.weight);
        //3.调用对象方法
        System.out.println(girl1.name+"的BMI是"+girl1.caluculaBMI());
    }
}
