package basicLanguage;

public class Text8_VariadicParameter {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5));
        System.out.println(aaa(1,1,1,6,1,1));

    }
    public static  int add(int... nums){
        int sum=0;
        for(int i=0;i< nums.length;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
    public static  int aaa(int a,int... nums){
        int sum=0;
        sum=a+nums.length;
        return sum;
    }
}
