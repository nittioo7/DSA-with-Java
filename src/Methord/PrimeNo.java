package Methord;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Boolean isprime = prime(num);
        System.out.println(isprime);

    }

    static Boolean prime(int num) {
        int c = 2;

        while(c * c <= num){
            if(num % c == 0){
                return false;
            }else {
                c++;
            }
        }return true;
    }
}
