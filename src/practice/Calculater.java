package practice;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter opretor");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                //take input of two number
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(op == '+'){
                    ans = a + b;
                }
                if(op == '-'){
                    ans = a - b;
                }
                if(op == '*'){
                    ans = a * b;
                }
                if(op == '/'){
                    if(b != 0) {
                        ans = a / b;
                    }else{
                        System.out.println("Give correct input");
                    }
                }
                if(op == '%'){
                    ans = a % b;
                }
                System.out.println("Answer: " + ans);

            } else if (op == 'x' || op == 'X') {
                break;
            }else{
                System.out.println("Enter valid operator");
            }

        }
    }
}
