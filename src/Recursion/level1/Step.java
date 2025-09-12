package Recursion.level1;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class Step {
    public static void main(String[] args) {
        int a = 14;
        int ans = numberOfSteps(a);
        System.out.println(ans);
    }
    public static int numberOfSteps(int a){
        return helper(a, 0);
    }
    public static int helper(int a, int b){
        if(a == 0){
            return b;
        }
        if (a% 2 == 0){
            return helper(a/2, b+1);
        }
        return helper(a-1, b+1);
    }
}
