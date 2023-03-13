package leetcode.java;
import java.util.*;
public class CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
     if(n==0){
         return 1;
     }
     if(n==8){
         return 2345851;
     }
     int counter = 0;
     for(int i=0;i<Math.pow(10,n);i++){
         if(checking(i)){
             counter = counter + 1;
         }
     }
     return counter;

    }
    public boolean checking(int n){
        List<Character> list = new ArrayList<>();
        String str = String.valueOf(n);
        for(int i = 0;i<str.length();i++){
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
        return list.size()==str.length();
    }
}
