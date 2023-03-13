package leetcode.java;

public class CountPairsOfSimilarStrings {
        public int similarPairs(String[] words) {
        int counter = 0;
        for(int i=0; i < words.length  -1 ; i++) {
      for(int j = i+1; j <words.length ; j++){
        if(con(words[i] , words[j]) && con(words[j] , words[i])){
          counter++;
        }
      }
        }
        return counter;
    }
    public boolean con(String s , String t ){
      for(int i=0;i < t.length() ; i++){
        if(s.indexOf(String.valueOf(t.charAt(i))) < 0){
          return false;
        }
      }
      return true;
    }
}
