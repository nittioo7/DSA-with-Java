package Recursion.level1;

public class palindrome {
    public static void main(String[] args){
        int a = 1234321;
        System.out.println(pal(a));
    }
    public static boolean pal(int a){
        return a == rev(a);
    }
    public static int rev(int a){
        int digit = (int)(Math.log10(a) + 1);
        return helper(a, digit);
    }
    public static int helper(int a, int digit){
        if(a%10 == a){
            return a;
        }
        int rem = a%10;
        return rem*(int)(Math.pow(10, digit -1)) + helper(a/10, digit -1);
    }
}
