package Recursion.level1;

public class CountZero {
    public static void main(String[] args){
        int a = 2000204;
        int ans = count2(a);
        System.out.println(ans);
    }
    public static int count(int a, int b){
        if (a%10 == a){
            return b;
        }
        if(a%10 == 0){
            b++;
        }
        return count(a/10, b);
    }
    public static int count2(int a){
        return helper(a, 0);
    }
    // how to pass samee value to above call(Special)
    public static int helper(int a, int b){
        if (a == 0){
            return b;
        }
        if (a%10 == 0){
            return helper(a/10, b+ 1);
        }
        return helper(a/10, b);
    }
}
