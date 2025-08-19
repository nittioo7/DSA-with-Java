package LinearSearch;

import java.util.Arrays;

public class SearchIn2Darry {
    public static void main(String[] args){
        int[][] arr = {
                {12,53},
                {23,35,32,5},
                {34,55,6,2},
                {2,4}
        };
        int tar = 6;
        int[] ans = search(arr, tar);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }
    //search in 2D array
    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    //Max in 2D array
    static int max(int[][] arr){
        int max = arr[0][0];
        for(int[] a : arr){
            for(int ele: a){
                if(max < ele){
                    max = ele;
                }
            }
        }
        return max;
    }
}
