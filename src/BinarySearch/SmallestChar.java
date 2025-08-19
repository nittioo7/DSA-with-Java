package BinarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestChar {
    public static void main(String[] args) {
        char[] ar = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n','n'};
        char target = 'e';
        System.out.println("Char: " + greatChar(ar, target));
    }

    private static char greatChar(char[] ar, char target) {
        int start = 0;
        int end = ar.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(ar[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return ar[start % ar.length];
    }

}
