package leetcode.java;

public class DetectCapital {
          public static boolean detectCapitalUse(String word) {
        return res(word);
    }

    public static boolean res(String str){
        if(allCapital(str))return true;
        if(allLower(str))return true;
        if(oneCapital(str))return true;
        return false;
    }
    public static boolean allCapital(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isUpperCase(str.charAt(i)))
                return false;
        }
        return true;
    }
    public static boolean allLower(String str){
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isLowerCase(str.charAt(i)))
                return false;
        }
        return true;
    }
    public static boolean oneCapital(String str){
        for (int i = 1; i < str.length(); i++) {
            if(!Character.isLowerCase(str.charAt(i)))
                return false;
        }

        return Character.isUpperCase(str.charAt(0));
    }
}
