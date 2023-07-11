package leetcode.java;

import java.util.*;

public class CellsinaRangeonanExcelSheet {
     public List<String> cellsInRange(String s) {


      final String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      List<String> list = new ArrayList<>();


      int start = (int)s.charAt(1) - 48;
      int end = (int)s.charAt(4) - 48;

      System.out.print(start + " " + end);

      String beg = s.substring(0,1);
      String en = s.substring(3,4);

      for(int i=str.indexOf(beg);i<=str.indexOf(en);i++){
        for(int j = start;j<=end;j++){
          list.add(convert(String.valueOf(str.charAt(i)),j));
        }
      }

      return list;

    }

    public String convert(String s , int digit){
      return s.concat(String.valueOf(digit));
    }
}
