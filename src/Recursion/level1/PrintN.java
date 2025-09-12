package Recursion.level1;

public class PrintN {
    public static void main(String[] args){
        int a = 5;
        fun(a);
        funRev(a);
        funBoth(a);
    }
    public static void fun(int a){
        if (a == 0){
            return;
        }
        System.out.println(a);
        fun(a-1);
    }
    public static void funRev(int a){
        if (a == 0){
            return;
        }
        funRev(a -1);
        System.out.println(a);
    }
    public static void funBoth(int a){
        if (a == 0) {
            return;
        }
        System.out.println(a);
        funBoth(a-1);
        System.out.println(a);
    }
}
