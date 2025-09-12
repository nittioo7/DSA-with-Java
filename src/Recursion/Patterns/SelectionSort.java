package Recursion.Patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,3,4,2,1};
        sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int a, int b,int max){
        if(a == 0){
            return;
        }
        if(b <= a){
            if(arr[b] > arr[max]){
                sort(arr,a,b+1,b);
            }
            else{
                sort(arr,a,b+1,max);
            }
        }
        else {
            int t= arr[max];
            arr[max] = arr[a];
            arr[a] = t;
            sort(arr, a-1,0,0);
        }
    }
}
