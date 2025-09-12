package Recursion.level1;

public class ReverseNumber {
    public static void main(String[] args){
        int a =12345;
        rev(a);
//        System.out.println(sum);
        System.out.println(rev2(a));
    }
    static int sum = 0;
    public static void rev(int a){
        if (a == 0){
            return;
        }
        int b = a%10;
        sum = sum * 10 + b;
        rev(a/10);
    }
    public static int rev2(int a){
        int digit = (int)(Math.log10(a)+1);
        return helper(a,digit);
    }
    public static int helper(int a, int digit){
        if (a%10 == a){
            return a;
        }
        int rem = a%10;
        return rem*(int)(Math.pow(10, digit - 1)) + helper(a/10, digit -1);
    }
}
