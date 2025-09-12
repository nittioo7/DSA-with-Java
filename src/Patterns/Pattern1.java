package Patterns;

public class Pattern1 {
    public static void main(String[] args){
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
    }
    public static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
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
    public static void pattern6(int n){
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
    public static void pattern7(int n){
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
    public static void pattern8(int n){
        for (int row = 1; row <= n; row++) {
            int space = -row + n;
            for (int i = 0; i <= space; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i < 2*row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for (int row = n; row >= 1; row--) {
            int noSpace = n - row;
            for (int space = 0; space <= noSpace; space++) {
                System.out.print(" ");
            }
            for (int col = 2*row; col > 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
