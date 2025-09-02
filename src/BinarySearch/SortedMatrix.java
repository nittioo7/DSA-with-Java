package BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    public static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;

        if (col == 0) {
            return new int[]{-1, -1};
        }
        if (row == 1) {
            return binarySearch(arr, 0, 0, col - 1, target);
        }
        // run the loop till two rows are remaining
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        // four case will be checked
        // for first half
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid - 1, target);
        }
        // 2 half
        if (target >= arr[rStart][cMid + 1] && target < arr[rStart][col - 1]) {
            return binarySearch(arr, rStart, cMid + 1, col - 1, target);
        }
        // 3 half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }
        //4 half
        else {
            return binarySearch(arr, rStart + 1, cMid + 1, col - 1, target);
        }
    }

    public static int[] binarySearch(int[][] matrix, int row, int Cstart, int Cend, int target) {
        while (Cstart <= Cend) {
            int mid = Cstart + (Cend - Cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                Cstart = mid + 1;
            } else {
                Cend = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }


}
