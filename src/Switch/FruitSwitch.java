package Switch;

import java.util.Scanner;

public class FruitSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit name here: ");
        String fruit = sc.next().trim();
        switch(fruit){
            case "Mango": {
                System.out.println("Yellow");
            }
            case "Apple" : {
                System.out.println("Red");
                break;
            }
            case "orange" : {
                System.out.println("Orange");
            }
            case "grapes" : {
                System.out.println("Green");
                break;
            }
            default:
                System.out.println("Enter valid fruit");
        }

    }
}
