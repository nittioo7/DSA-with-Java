package Sort;

import java.util.Arrays;

public class BubbleSort {
    // also knows as comparison and sinking sort or exchange sort
    // It is stable sort algorithm
    public static void main(String[] args){
        int[] arr = {4, 3,2,0 , -1, 5};
        int[] arr1 = {1, 2, 3,4};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j -1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
