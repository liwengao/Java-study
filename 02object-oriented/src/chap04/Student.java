package chap04;

public class Student {
    public static int getCount() {
        //1.静态方法中不能用this
        //this.name = "张三";
        //2.静态方法不能访问非静态成员变量
        //name = "张三";
        //3.静态方法不能访问非非静态成员方法
        //displayInfo();(因为静态没有对象)
        return count;
    }

    private static int count = 0;

    private int id;
    private String name;
    private String gender;

    public Student(String gender, int id, String name) {
        count++;
        this.gender = gender;
        this.id = count;
        this.name = name;
    }
    public String displayInfo() {
        return "学号: " + id + ", 姓名: " + name + ", 性别: " + gender;
    }
}
