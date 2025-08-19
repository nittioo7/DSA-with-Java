package BinarySearch;

import java.util.Scanner;

public class CielingNumber {
    public static void main(String[] args){
        int[] arr = {88,76,65,55,45,34,32,8,7,5,4,2,1};
        int[] arr1 = {1 ,2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 35, 54, 67};

        Scanner in  = new Scanner(System.in);
        int target = in.nextInt();
        int ans = celing(arr1, target);
        System.out.println("Answer: " + ans);
    }

    private static int celing(int[] arr, int target) {
        int end = arr.length -1;
        int start = 0;
        if (arr[end] < target) {
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }return start;

    }
}
