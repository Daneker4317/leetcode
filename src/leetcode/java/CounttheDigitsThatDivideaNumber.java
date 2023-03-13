package leetcode.java;

public class CounttheDigitsThatDivideaNumber {
        public int countDigits(int num) {
        int counter = 0;
        for(char ch : String.valueOf(num).toCharArray()){
          if(num%((int)ch - 48)==0){
            counter++;
          }
        }
        return counter;
    }
}
