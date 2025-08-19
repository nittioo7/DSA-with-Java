package Methord;

import java.util.Scanner;

import static Methord.PrimeNo.prime;

public class NthPrime {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("List of first n: ");
        int n = cs.nextInt();
        for (int i = 2; i <= n; i++){
            boolean isprime = prime(i);
            if(isprime){
                System.out.println("From for: " + i);
            }
        }
        int i = 2;
        int c = 1;
        while (c <= n){
            boolean isprime = prime(i);
            if(isprime){
                System.out.println("From while" + i);
                c++;
            }
            i++;
        }

    }
}
