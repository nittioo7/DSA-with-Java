package Recursion.Basics;

public class Recursion {
    public static void main(String[] args) {
//        print1(5);
        // Recursion - a funtion call function for this case - throw - stact over flow error
        printn(10);
    }
    public static void printn(int a){
        if (a < 1){
            return;
        }
        System.out.println(a);
        printn(a -1);
    }
    public static void print1(int a){
        System.out.println(a);
        print2(a-1);
    }
    public static void print2(int a){
        System.out.println(a);
        print1(a-1);
    }
}
