package LinearSearch;

public class StringSearch {
    public static void main(String[] args){
        String name = "nitesh";
        char tar = 's';
        System.out.println(search1(name,tar));
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }return false;
    }
    static boolean search1(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int index = 0; index < str.length(); index++){
            if(target == str.charAt(index)){
                return true;
            }
        }return false;
    }
}
