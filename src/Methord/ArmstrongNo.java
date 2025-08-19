package Methord;

public class ArmstrongNo {
    public static void main(String[] args){

        int c = 1;
        while (c< 1000){
//            System.out.println("n: " +c);
            int isArmstrong = findArm(c);

            if(isArmstrong == c){
                System.out.println("Is armstrong: " + c);
            }
//            System.out.println("not arm: " + c);
            c++;
        }
    }
    static int findArm(int n){
        int temp ;
        int total = 0;
        while (n> 0) {
            temp = n % 10;
//            System.out.println("1: " + temp);
            temp = temp * temp * temp;
//            System.out.println("2: " + temp);
            total = temp + total;
//            System.out.println("3: "+ temp);
            n = n / 10;
//            System.out.println("3: " + total);
//            if (total == n){
//                return true;
//            }
//        }return false;
        }
//        System.out.println("n: " +n);
//        System.out.println("4 :" + total);
        return total;
    }
}
