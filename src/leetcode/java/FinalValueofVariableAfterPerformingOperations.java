package leetcode.java;

public class FinalValueofVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(int i=0;i<operations.length;i++){
          if(operations[i].charAt(1)=='+'){
            count++;
          }else{
            count--;
          }
        }
        return count;
    }
}
