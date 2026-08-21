package basicLanguage;
import java.util.Random;
import java.util.Scanner;
public class Instant2_NumberPUzzle {
    public static void main(String[] args) {
        //0.记录空格位置
        int size=4;
        int[] emptypos = {3, 3};
        //1.生成棋盘
        int[][] boards =initboards(size, emptypos)
        ;
        do {


            //2.打印棋盘
            printBoards(boards);

            //3.键盘录入移动方向
            String direction = nextDirection();

            //4.移动棋子
            tryMove(boards, emptypos, direction);

            //5.判断是否获胜
            if(isWin(boards)) {
                System.out.println("恭喜获胜！");
                break;
            }


        }while (true);
    }

    static void tryMove(int[][] boards,int[]emptypos,String direction) {
        //1.判断移动方向，找到对应棋子offset
        int[] offset = switch (direction)
        {
            case "w" -> new int[]{1, 0};
            case "s" -> new int[]{-1, 0};
            case "a" -> new int[]{0, 1};
            case "d" -> new int[]{0, -1};
            default -> new int[]{0, 0};
        };
        if (offset.length==0)
        {
            System.out.println("无效的移动方向");
            return;
        }
        //2.计算目标棋子索引
        //2.1获取空格索引位置
        int emptyX = emptypos[0];
        int emptyY = emptypos[1];
        //2.2计算目标索引
        int targetX = emptyX + offset[0];
        int targetY = emptyY + offset[1];
        //2.3判断角标是否越界
        if (targetX < 0 || targetX >= boards.length || targetY < 0 || targetY >= boards[0].length) {
            System.out.println("无效的移动方向");
            return;
        }
        System.out.println(boards[targetX][targetY]);
        //3.将空格与目标棋子交换
        //3.1.把目标棋子值放在空格位置
        boards[emptyX][emptyY] = boards[targetX][targetY];
        //3.2.把空格值放在目标位置
        boards[targetX][targetY] = 0;
        //更新空格位置
       emptypos[0] = targetX;
       emptypos[1] = targetY;

    }

    static String nextDirection() {
        //1.创建Scanner对象
        Scanner scanner = new Scanner(System.in);
       //2.提示用户移动方向
        System.out.println("请输入移动方向（w:上、s:下、a:左、d:右）：");
        //3.录入方向
        return scanner.next();
    }

    static void printBoards(int[][] boards)
    {
        for (int i = 0; i < boards.length; i++) {
            System.out.println("---------------------");
            System.out.print("| ");
            for (int j = 0; j < boards[i].length; j++) {
                if (boards[i][j] < 10) {
                    System.out.print(" ");
                }
                if(boards[i][j] == 0) System.out.print("  | ");
                else System.out.print(boards[i][j] + " | ");
            }
            System.out.println();
        }
    }
    static boolean isWin(int[][] boards) {
        //定义一个变量，用来判断棋子的值是否从1-15递增
        int num=1;
        for (int i = 0; i < boards.length; i++) {
            int[] row = boards[i];
            //2.遍历当前行的每一个元素，判断是否等于num，最后一个除外
        for (int j = 0; j < row.length; j++) {
            if (row[j] != num && !(row[j] == 0 && num == 16)) {
                return false;
            }
            num++;
        }
        }
        return true;
    }
    static int[][] initboards(int size, int[] emptypos) {
        //1.动态生成棋盘,棋盘大小size*size
        int[][] boards = new int[size][size];
        int num=1;
        for (int i = 0; i < boards.length; i++) {

            for (int j = 0; j < boards[i].length; j++) {
                boards[i][j] = num;
                num++;
            }
        }
        //2.打乱棋盘
        String[] directions = {"w", "s", "a", "d"};
        //2.1随机生成移动方向(随机生成0-3)
        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            int index = random.nextInt(4);
            String direction = directions[index];
            //2.2移动棋子
            tryMove(boards, emptypos, direction);
        }
        return boards;
    }

}
