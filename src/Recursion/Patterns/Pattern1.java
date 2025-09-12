package Recursion.Patterns;

import java.util.Arrays;

public class Pattern1 {
    public static void main(String[] args) {
        print(4,0);
        pattern(4,0);
        int[] arr = {4,3,5,2,1};
        bubble(arr,arr.length -1,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void print(int a, int b){
        if(a == 0){
//            System.out.println();
            return;
        }
        if(b < a){
            System.out.print("* ");
            print(a,b+1);
        }
        else {
            System.out.println();
            print(a-1, 0);
        }
    }
    public static void pattern(int a, int b){
        if(a == 0){
            return;
        }
        if(b < a){
            pattern(a, b+1);
            System.out.print("* ");

        }
        else {
            pattern(a -1,0);
            System.out.println();

        }
    }
    public static void bubble(int[] arr,int s, int e){
        if(s == 0){
            return;
        }
        if(e < s){
            if(arr[e] > arr[e+1]){
                //Swap
                int a = arr[e];
                arr[e] = arr[e+1];
                arr[e+1] = a;
            }
            bubble(arr,s,e+1);
        }else {
            bubble(arr, s -1, 0);
        }
    }
}
