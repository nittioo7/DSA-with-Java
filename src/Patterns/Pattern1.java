package Patterns;

public class Pattern1 {
    public static void main(String[] args){
        parrtern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
    }
    public static void parrtern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 2; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        int i = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }i--;
            System.out.println();
        }
    }
    public static void pattern6(int n){
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(col >= i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }i++;
            System.out.println();
        }
    }
}
