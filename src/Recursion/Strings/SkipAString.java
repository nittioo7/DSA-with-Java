package Recursion.Strings;

public class SkipAString {
    public static void main(String[] args){
        String a = "sfkappleklsdf";
        System.out.println(skipApple(a));
        System.out.println(skipAppNotApple("dfsapplejgappgdkapple"));
    }
    public static String skipApple(String a){
        if(a.isEmpty()){
            return "";
        }
        if(a.startsWith("apple")){
            return skipApple(a.substring(5));
        }
        else{
            return a.charAt(0) + skipApple(a.substring(1));
        }
    }
    public static String skipAppNotApple(String a){
        if(a.isEmpty()){
            return "";
        }
        if (a.startsWith("app") && !a.startsWith("apple")){
            return skipAppNotApple(a.substring(3));
        }
        else{
            return a.charAt(0) + skipAppNotApple(a.substring(1));
        }
    }
}
