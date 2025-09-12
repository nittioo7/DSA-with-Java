package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {4,2,6,1,3,8,8,5};
        int target = 8;
        System.out.println(isPresent(arr, target, 0));
        int ans = linear(arr, target);
        System.out.println(ans);
        int ans1 = helperRev(arr, target, arr.length-1);
        System.out.println(ans1);
        findAll(arr,target,0);
//        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        findAll(arr, target, 0,list);
        System.out.println(list);
        System.out.println(findAll1(arr, target, 0));

    }
    public static ArrayList<Integer> findAll1(int[] arr, int tar, int a){
        ArrayList<Integer> list = new ArrayList<>();
        if (a == arr.length){
            return list;
        }
        // this will contain answer from this call only.
        if (arr[a] == tar){
            list.add(a);
        }
        // to store data form below call
        ArrayList<Integer> ansFromBelowCall = findAll1(arr, tar, a + 1);
        list.addAll(ansFromBelowCall);
        return list;
    }
    public static ArrayList<Integer> findAll(int[] arr, int tar, int a, ArrayList<Integer> list){
        if(a == arr.length){
            return list;
        }
        if(arr[a] == tar){
            list.add(a);
        }
        return findAll(arr, tar, a+1, list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAll(int[] arr, int tar, int a){
        if(a == arr.length){
            return;
        }
        if(arr[a] == tar){
            list.add(a);
        }
        findAll(arr, tar, a+1);
    }
    public static boolean isPresent(int[] arr,int tar,int a){
        if(a == arr.length){
            return false;
        }
        return arr[a] == tar || isPresent(arr, tar, a+1);

    }
    public static int linear(int[] arr, int tar){
        int a = 0;
        return helper(arr,tar,a);
//        return helperRev(arr, tar, arr.length);
    }
    public static int helperRev(int[] arr, int tar, int end){
        if(end == -1){
            return -1;
        }
        if(arr[end] == tar){
            return end;
        }
        return helperRev(arr, tar, end -1);
    }
    public static int helper(int[]arr, int tar, int a){
        if(a == arr.length){
            return -1;
        }
        if(arr[a] == tar){
            return a;
        }
        return helper(arr, tar, a+1);
    }
}
