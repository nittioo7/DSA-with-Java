package Recursion.Basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int ans = BS(arr, target, 0, arr.length);
        System.out.println(ans);
    }
    public static int BS(int[] arr, int tar, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == tar){
            return mid;
        }
        if(arr[mid] < tar){
            return BS(arr, tar, mid + 1, end);
        }
        else {
            return BS(arr, tar, start, mid -1);
        }

    }
}
