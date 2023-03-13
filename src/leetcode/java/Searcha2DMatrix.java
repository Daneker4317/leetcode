package leetcode.java;

public class Searcha2DMatrix {
        public boolean searchMatrix(int[][] matrix, int target) {
        for(int [] v : matrix){
          for(int k : v)
          if (k == target){
              return true;
          }
        }
        return false;
    }
}
