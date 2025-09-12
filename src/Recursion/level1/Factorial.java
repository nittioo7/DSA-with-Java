package Recursion.level1;

public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        int ans = fact(a);
        System.out.println(ans);
    }
    public static int fact(int a){
        if (a == 1) {
            return a;
        }
        return a*fact(a-1);
    }
}
