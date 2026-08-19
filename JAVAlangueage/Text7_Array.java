package JAVAlangueage;

public class Text7_Array {
    public static void main(String[] args) {
        //一维数组
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        String[] arr2 = {"苹果", "香蕉", "樱桃"};
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        //二维数组
//        String[][] students = new String[4][5];
//        students[0][0] = "张三";
        String[][] students = {
                {"张三", "李四", "王五"},
                {"赵六", "孙七", "周八"},
                {"吴九", "郑十", "王十一"},
                {"陈十二", "陈十三", "褚十四"}
        };
        for (int i = 0; i < students.length; i++) {
            String[] row=students[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }

    }
}
