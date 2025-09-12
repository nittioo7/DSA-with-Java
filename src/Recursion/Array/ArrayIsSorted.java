package Recursion.Array;

public class ArrayIsSorted {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8,7};
        System.out.println(isSorted1(arr,0));
    }
    public static boolean isSorted1(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && isSorted1(arr, i+1);
    }
    public static boolean isSorted(int[] arr){
        int a= 0,b=1;
        return helper(arr, a, b);
    }
    public static boolean helper(int[] arr, int a, int b){
        if(a == arr.length-1){
            return true;
        }
        if(arr[a] > arr[b]){
            return false;
        }
        return helper(arr, a +1, b+1);
    }
}
