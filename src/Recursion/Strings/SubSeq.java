package Recursion.Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args){
        sub("", "abc");
        System.out.println(sub1("", "abc"));
        subAscii("" , "ab");
        System.out.println(subAsciiList("" ,"ab"));
    }
    public static void sub(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(p+ch,up.substring(1));
        sub(p,up.substring(1));
    }
    public static ArrayList<String> sub1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sub1(p + ch, up.substring(1));
        ArrayList<String> right = sub1(p , up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void subAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subAscii(p, up.substring(1));
        subAscii(p+ch, up.substring(1));
        subAscii(p + (ch+0),up.substring(1));
    }
    public static ArrayList<String> subAsciiList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> one = subAsciiList(p, up.substring(1));
        ArrayList<String> two = subAsciiList(p+ch, up.substring(1));
        ArrayList<String> three = subAsciiList(p+(ch + 0),up.substring(1));
        one.addAll(two);
        one.addAll(three);
        return one;
    }
}
