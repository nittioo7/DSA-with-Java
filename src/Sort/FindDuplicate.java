package Sort;

public class FindDuplicate {
//    https://leetcode.com/problems/find-the-duplicate-number/
    public static void main(String[] args){

    }
    public static int duplicate(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i +1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }
                else {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
