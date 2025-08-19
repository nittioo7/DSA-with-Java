package LinearSearch;

public class MinAndMax {
    public static void main(String[] args) {

        int[] a = {6,7,3,5,8,1,-2,16};
        System.out.println("Min: " + min(a));
        System.out.println("Max: " + max(a));
    }
    static int min(int[] arr){
        if(arr.length == 0 ){
            return -1;
        }
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }return min;
    }
    static int max(int[] arr){
        if(arr.length == 0 ){
            return -1;
        }
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }return max;
    }
}
