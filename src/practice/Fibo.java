package practice;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        // find fibonnioc series till the input given by user
        int frist = 0;
        int secound = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Give a number: ");
        int input = in.nextInt();
        System.out.print("0, 1");

        for (int i = 2; i < input; i++) {
            int temp = secound;
            secound = frist + temp;
            frist = temp;
            System.out.print(", " + secound);
        }
    }
}
