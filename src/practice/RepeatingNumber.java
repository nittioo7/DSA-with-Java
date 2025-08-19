package practice;

import java.util.Scanner;

public class RepeatingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("For which number you have to find repeating number: ");
        long input = sc.nextLong();
        System.out.print("Check which number is repeating: ");
        int checkNo = sc.nextInt();
        int count = 0;
        while (input > 0){
            int rem = (int)(input % 10);
            if(rem == checkNo){
                count++;
            }
            input = input/10;
        }
        System.out.println("Count: " +count);
    }
}
