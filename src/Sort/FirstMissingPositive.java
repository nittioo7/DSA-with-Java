package Sort;

//import java.util.List;
//https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        int ans = firstPositive(arr);
        System.out.println(ans);
    }
    public static int firstPositive(int[] arr){
        int i =0;
        while (i < arr.length){
            int cor = arr[i] -1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[cor]){
                swap(arr, i, cor);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        String name = "Nitesh";
        String na = "Nitesh";
        na = "Kumar";
    }
}
