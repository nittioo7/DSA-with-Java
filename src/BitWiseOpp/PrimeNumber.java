package BitWiseOpp;

public class PrimeNumber {
    public static void main(String[] args) {
        int a = 15;
        boolean ans = isPrime(a);
        System.out.println(ans);
    }
    public static boolean isPrime(int a){
        int n = 2;
        while (n*n < a){
            if(a%n == 0){
                return false;
            }
            n++;
        }
        return true;

    }
}
