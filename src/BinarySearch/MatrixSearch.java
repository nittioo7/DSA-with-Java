package BinarySearch;

import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 8)));
    }
    public static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length -1;
        while (col >= 0 && row < arr.length){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            else if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
