package Recursion.level1;

public class ProductOfDigits {
    public static void main(String[] args){
        int a = 1234;
        int ans = prod(a);
        System.out.println(ans);
    }
    public static int prod(int a){
        if (a%10 == a){
            return a;
        }
        return (a%10) * prod(a/10);
    }
}
