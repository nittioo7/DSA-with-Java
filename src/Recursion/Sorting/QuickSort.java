package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {5,3,4,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr, int low, int high){
        if(high < low){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = arr[m];
        while(s <= e){
            // if it is sorted it will not swap
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr,s,high );
    }
}
