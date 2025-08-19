package BinarySearch;

import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args){
        int[] arr1 = {1 ,2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 35, 54, 67};

        Scanner in  = new Scanner(System.in);
        int target = in.nextInt();
        int ans = floor(arr1, target);
        System.out.println("Answer: " + ans);
    }
    static int floor(int[] ar, int target){
        int start = 0;
        int end = ar.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(ar[mid] < target){
                start = mid + 1;
            } else if (ar[mid] > target) {
                end = mid - 1;
            }else{
                return mid;
            }
        }return end;
    }
}
