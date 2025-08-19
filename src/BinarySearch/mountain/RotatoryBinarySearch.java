package BinarySearch.mountain;

public class RotatoryBinarySearch {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};

        int pivot = findPivot(arr);
        System.out.println("Pivot" + pivot);
        int target = 4;

        int ans = search(arr, target, pivot);
        System.out.println(ans);

    }
    public static int search(int[] a, int target, int pivot){
        if(target == a[pivot]) {
                return pivot;
        }
        if(target >= a[0]){
            binarySearch(a,target, 0,pivot);
        }
        return binarySearch(a,target, pivot +1,a.length -1);
    }
    public static int binarySearch(int[] arr, int target,int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return  mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }return mid;
        }return -1;
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] < arr[mid -1]){
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
}
