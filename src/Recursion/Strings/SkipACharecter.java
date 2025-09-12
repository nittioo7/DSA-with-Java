package Recursion.Strings;

public class SkipACharecter {
    public static void main(String[] args){
        skip("","adjhahvaha");
        String a = "adjhahvaha";
        a = skip1(a);
        System.out.println(a);
    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    public static String skip1(String a){
        if(a.isEmpty()){
            return "";
        }
        char ch = a.charAt(0);
        if(ch == 'a'){
            return skip1(a.substring(1));
        }
        else{
            return ch + skip1(a.substring(1));
        }
    }
}
