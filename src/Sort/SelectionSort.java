package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4, 3,2,0 , -1, 5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = max(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    public static void swap(int[] arr, int max, int last){
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }
    public static int max(int[] arr, int start, int last){
        int max = start;
        for(int i = 0; i <= last; i++){
            if(arr[i] > arr[max] ){
                max = i;
            }
        }return max;
    }
}
