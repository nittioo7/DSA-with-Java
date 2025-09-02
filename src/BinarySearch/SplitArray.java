package BinarySearch;

public class SplitArray {
//    https://leetcode.com/problems/split-array-largest-sum/
    public static void main(String[] args){


    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length ; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //binary search
        while(start < end){
            int mid = start + (end - start)/2;
//            int sum = 0;
//            int pieces = 1;

            for (int num : nums) {
                if (canSplit(nums, mid, k)) {
                    end = mid;
                }
//                if(sum + num > mid){
//                    sum = num;
//                    pieces++;
//                }
//                else{
//                    sum += num;
//                }
//            }
//            if(pieces > k){
//                start = mid + 1;
//            }else {
//                end = mid;
//            }
                else {
                    start = mid + 1;
                }
            }
        }return start;
    }

    private static boolean canSplit(int[] nums, int mid, int k) {
        int piece = 1;
        int sum = 0;
        for(int num : nums){
            sum += num;
            if(sum > mid){
                sum = num;
                piece++;
                if(piece > k){
                    return false;
                }
            }
        }return true;
    }
}
