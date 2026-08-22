package chap04;

public class StaticDemo {
    static void main(String[] args) {
        System.out.println("学生人数：" + Student.getCount());
        Student s1 = new Student("男", 1, "张三");
        Student s2 = new Student("女", 2, "李四");
        System.out.println("学生人数：" + Student.getCount());
        System.out.println(s1.displayInfo());
        System.out.println(s2.displayInfo());
    }
}
