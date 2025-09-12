package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> list = sub(arr);
        for(List<Integer> l : list){
            System.out.println(l);
        }
    }
    public static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }


        return outer;
    }
}
