package LinearSearch;


public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4},
                {2,2,4},
                {1,2,5}
        };
        System.out.println(maxAcc(arr));
    }

    static int maxAcc(int[][] arr) {

        int ans = 0;
        for(int[] ars : arr){
            int total = 0;
            for(int ar: ars){
                total += ar;
            }
            if(total > ans){
                ans = total;
            }
        }return ans;
    }
}
