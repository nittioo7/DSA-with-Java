package LinearSearch;

public class LinearSearchInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 32, 4, 24, -42, 56};
        int target = 56;
        int ans = linearSearch1(arr, target);
        System.out.println(ans);
        boolean ans1 = linearSearch2(arr, target);
        System.out.println(ans1);
    }

    // return index
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //loop to search target
        for(int index = 0; index< arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //target not found
        return Integer.MAX_VALUE;
    }
    //return element
    static int linearSearch1(int[] arr, int target ){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }
    //return boolean
    static boolean linearSearch2(int[] arr, int target){
        if(arr.length == 0 ){
            return false;
        }
        for(int element :arr){
            if (element == target){
                return true;
            }
        }return false;
    }
}
