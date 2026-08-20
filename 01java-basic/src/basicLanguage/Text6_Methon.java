package basicLanguage;

public class Text6_Methon {
    static void main(String[] args) {
        double max=getMax(10,20);
        System.out.println(max);
        sayHello("小王");
    }
    //求两数直接最大数
    static  double getMax(double a,double b)
    {
        return a>b?a:b;
    }
    static void sayHello(String name)
    {
        System.out.println("hello"+name);
    }


}
