package LinearSearch;

public class EvenDigit {
    public static void main(String[] args){
        int[] a = {1, 23,354, 5454, 35, 4, 54635, 356735};
        System.out.println(findNumbers(a));

    }
    public static int findNumbers(int[] nums) {
        int c = 0;
        for(int a : nums){
            if(digitNo(a)){
                c++;
            }
        }return c;
    }
    static boolean digitNo(int a){
//        int c = 0;
//        while(a > 0){
//            c++;
//            a= a/10;
////            c++;
//        }return even(c);
        return even((int)(Math.log10(a)) + 1);
    }
    static boolean even(int b){
        return b%2 ==0;
    }
}
