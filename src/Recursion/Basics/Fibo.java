package Recursion.Basics;

public class Fibo {
    public static void main(String[] args){
        long f = fibo(50);
        System.out.println(f);
//        for (int i = 1; i < 20; i++){
//            int ans = fibo(i);
//            System.out.println(STR."\{i} - \{ans}");
//        }
    }
    public static long fibo(int a){
        if (a < 2){
            return a;
        }
        return fibo(a - 1) + fibo(a - 2);
    }
}
