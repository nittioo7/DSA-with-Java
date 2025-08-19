package BinarySearch;

public class Mountain {
    public static void main(String[] args){
//        https://leetcode.com/problems/find-peak-element/
//        https://leetcode.com/problems/peak-index-in-a-mountain-array/
        int[] arr = {1,2,3,4,5,6,7,8,5,4,3,2,1,0};

        System.out.println(findPeakElement(arr));

    }
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (nums[mid] < nums[mid + 1]){
                start = mid +1;
            }
            else {
                end = mid;
            }
        }
        return start;

    }

}
