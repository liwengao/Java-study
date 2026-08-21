package chap01;

public class MemoryAlllocatiaoDemo {
    public static void main(String[] args) {
        //变量通过栈内存来分配
        //对象通过（girl1）在栈内存存储地址来索引到堆内存中的对象(Girl)
        Girl girl1 = new Girl();
        girl1.name = "小丽";
        girl1.height = 165;
        girl1.weight = 50;
        System.out.println(girl1.name);
        System.out.println(girl1.height);
        System.out.println(girl1.weight);
        Girl girl2 = new Girl();
        girl2=girl1;
        girl2.name = "小红";
        girl2.height = 170;
        System.out.println(girl1.name);
        System.out.println(girl1.height);

    }
}
