package BinarySearch;

import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {88,76,65,55,45,34,32,8,7,5,4,2,1};

        Scanner in  = new Scanner(System.in);
        int target = in.nextInt();
        int ans = search2(arr, target);
        System.out.println("Answer: " + ans);
    }
    static int search(int[] arr, int tar){
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end]){
            while (start <= end){
                int mid = start + (end - start)/2;
                if(arr[mid] == tar){
                    return mid;
                }
                else if(arr[mid] < tar){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }else {
            while (start <= end ){
                int mid = start + (end - start)/2;
                if(arr[mid] == tar){
                    return mid;
                } else if (arr[mid] < tar) {
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int search2(int[] arr, int tar){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == tar){
                return mid;
            }if(arr[start] < arr[end]){
                if(arr[mid] < tar){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else {
                if (arr[mid] < tar) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
