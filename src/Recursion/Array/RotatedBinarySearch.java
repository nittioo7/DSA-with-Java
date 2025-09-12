package Recursion.Array;

public class RotatedBinarySearch {
    public static void main(String[] args){
        int[] arr = {6,7,8,9,1,2,3,4};
        int target = 8;
        int start = 0;
        int end = arr.length-1;
        System.out.println(search(arr,target, start,end));

    }
    public static int search(int[] arr,int tar, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == tar){
            return mid;
        }
        if(arr[start] < arr[mid]){
            if(arr[start] <= tar && arr[mid] >= tar){
                return search(arr, tar, start, mid-1);
            }
            else {
                return search(arr, tar,mid + 1,end);
            }
        }
        if(arr[mid] <= tar && tar <= arr[mid]){
            return search(arr, tar, mid +1, end);
        }
        return search(arr, tar, start, mid -1);
    }
}
