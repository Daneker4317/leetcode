package leetcode.java;

public class NumberofStudentsDoingHomeworkataGivenTime {
   public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int counter = 0;
        for(int i=0;i<endTime.length;i++){
          if(startTime[i]<=queryTime && endTime[i]>=queryTime){
            counter = counter + 1;
          }
        }
        return counter;
    }
}
