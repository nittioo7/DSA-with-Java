package practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int in = sc.nextInt();
        int revseNo = 0;
        while (in > 0){
            int rem = in%10;
            revseNo = revseNo*10 + rem;
            in = in/10;
            System.out.println("revNo: " + revseNo);
        }
        System.out.println("revNo: " + revseNo);


    }
}
