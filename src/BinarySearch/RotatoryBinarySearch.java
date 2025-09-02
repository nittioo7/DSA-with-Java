package BinarySearch;

public class RotatoryBinarySearch {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};

        int pivot = findPivot(arr);
        System.out.println("Pivot" + pivot);
        int target = 0;

        int ans = search(arr, target, pivot);
        System.out.println(ans);
        int[] arr1 = {1,1,2,2,4,5,6,0};
        System.out.println("in duplicate: " + pivotInDuplicate(arr1));

    }
    public static int search(int[] a, int target, int pivot){
        if(target == a[pivot]) {
                return pivot;
        }
        if(target >= a[0]){
            return binarySearch(a,target, 0,pivot);
        }
        return binarySearch(a,target, pivot +1,a.length -1);
    }
    public static int binarySearch(int[] arr, int target,int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return  mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }return -1;
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid -1;
            }
            if(arr[start] >= arr[mid]){
                end = mid -1;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }

    public static int pivotInDuplicate(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid -1]){
                return mid - 1;
            }
            if(arr[mid] == arr[end] || arr[mid] == arr[start]){
                if (start < end && arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;
                if (start < end && arr[end] < arr[end -1]){
                    return end -1;
                }
                end ++;
            }
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
}
