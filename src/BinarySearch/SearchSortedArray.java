package BinarySearch;

import java.util.Scanner;

public class SearchSortedArray {
    public static void main(String[] args){

        int[] arr = {1 ,2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 35, 54, 67};
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        System.out.println(search(arr, tar));

    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
//        System.out.println(end);
        while (start <= end){
//            System.out.println('2');
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
//            System.out.println("end  " + end + "   start   " + start);
        }
        return -1;
    }
}
