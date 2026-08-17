package JAVAlangueage;

public class text4 {
    static void main(String[] args) {
        //1自动类型转换
        byte a=100;
        int b=a;
        System.out.println(b);
        //2强制类型转换
        int x=10;
        byte y=(byte)x;
        System.out.println(y);
        //3赋值运算符
        byte i=10;
        i+=5;//i=(byte)(i+5)
        System.out.println(i);
    }
}
