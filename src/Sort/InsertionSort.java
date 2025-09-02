package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {4, 3,2,0 , -1, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Why - less numbers of step

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
