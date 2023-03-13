package leetcode.java;

public class CountSquareSumTriples {
        public int countTriples(int n) {
        int counter = 0;
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
            for(int k=1;k<=n;k++){
              if(Math.sqrt(i*i+j*j)==k){
                counter = counter + 1;
              }
            }
          }
        }
        return counter;
    }
}
