package leetcode.java;

import java.util.*;
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
      if(rowIndex==1)return List.of(1,1);
      if(rowIndex==0)return List.of(1);
       return  generate(rowIndex+1).get(rowIndex);

    }
     public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> pascalTriangle = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          row.add(1);
        } else {
          row.add(pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j));
        }
      }
      pascalTriangle.add(row);
    }
    pascalTriangle.forEach(System.out::println);
    return pascalTriangle;
  }
}

