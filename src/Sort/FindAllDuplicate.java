package Sort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args){


    }
    public static List<Integer> sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
