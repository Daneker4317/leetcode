package leetcode.java;

public class CheckIfTheSentenceIsPangram {
        public boolean checkIfPangram(String sentence) {
        final String str = "qwertyuiopasdfghjklzxcvbnm";
        for(int i=0;i<str.length();i++){
          if(sentence.indexOf(str.charAt(i))<0){
            return false;
          }
        }
        return true;
    }
}
