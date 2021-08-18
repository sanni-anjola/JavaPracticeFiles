package africa.semicolon.chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexOfAndLastIndexOfMethods{
    public static void main(String[] args) {
        System.out.println(indexOf("helolo", "lo", 17));
        System.out.println("helolo".indexOf("lo", 17));
        System.out.println(lastIndexOf("helolo", "lo", 3));
        System.out.println("helolo".lastIndexOf("lo", 3));
        System.out.println(lastIndexOf("helolo", 'l', 3));
    }
    public static int indexOf(String strToSearch, int ch, int fromIndex){
        for (int i = fromIndex; i < strToSearch.length(); i++) {
            if(strToSearch.charAt(i) == ch) return i;
        }
        return -1;
    }

    public static int indexOf(String strToSearch, int ch){
        return indexOf(strToSearch, ch, 0);
    }

    public static int indexOf(String strToSearch, String str, int fromIndex){
        for (int i = fromIndex; i < strToSearch.length(); i++) {
            if(strToSearch.charAt(i) == str.charAt(0) ) {
                if(strToSearch.substring(i, i+str.length()).equals(str)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int indexOf(String strToSearch, String str){
        return indexOf(strToSearch, str, 0);
    }

    public static int lastIndexOf(String strToSearch, int ch, int fromIndex){
        for (int i = fromIndex; i >= 0; i--) {
            if(strToSearch.charAt(i) == ch) return i;
        }
        return -1;
    }

    public static int lastIndexOf(String strToSearch, int ch){
        return lastIndexOf(strToSearch, ch, strToSearch.length() - 1);
    }

    public static int lastIndexOf(String strToSearch, String str, int fromIndex){
        for (int i = fromIndex; i >= 0; i--) {
            if(strToSearch.charAt(i) == str.charAt(0) ) {
                if(strToSearch.substring(i, i+str.length()).equals(str)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int lastIndexOf(String strToSearch, String str){
        return lastIndexOf(strToSearch, str, strToSearch.length() - 1);
    }
}
