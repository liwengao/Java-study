import java.util.Scanner;
public class Text5_StringEquals {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入s2:");
        String s1="hello";
        String s2=scanner.nextLine();
        System.out.println(s1.equals(s2));
        System.out.println(!s1.equals(s2));
        //String 不能用==进行比较
        System.out.println(s1==s2);
        System.out.println(s1.concat(s2));//字符拼接

    }
}
