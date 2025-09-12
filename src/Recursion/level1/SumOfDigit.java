package Recursion.level1;

public class SumOfDigit {
    public static void main(String[] args){
        int a = 5635;
        int ans = sum(a);
        System.out.println(ans);
    }
    public static int sum(int a){
        if (a == 0){
            return 0;
        }
        return (a%10) + sum(a/10);
    }
}
