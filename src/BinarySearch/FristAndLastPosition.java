package BinarySearch;

public class FristAndLastPosition {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 4, 5, 6, 7, 7, 7, 7,8, 8, 9, 10, 11, 11};
        int tar= 7;
        System.out.println((firstLast(arr, tar).toString()));

    }
    static int[] firstLast(int[] arr, int target){
        int[] ans = {-1, -1};

        ans[0] = search(arr, target, true);
        if(ans[0] != -1){
            ans[1] = search(arr, target, false);
        }

        return ans;
    }
    static int search(int[] arr, int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
