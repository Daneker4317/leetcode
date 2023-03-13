package leetcode.java;

public class MinMaxGame {
        public int minMaxGame(int[] nums) {
        return rec(nums);
    }
    public int rec(int [] arr){
      if(arr.length == 1)return arr[0];
      int [] res = new int [arr.length / 2 ];
      for(int i=0;i<res.length;i++){
          if(i %2 ==0)res[i] = (int)Math.min(arr[2 * i], arr[2 * i + 1]);
          else res[i] = (int)Math.max(arr[2 * i], arr[2 * i + 1]);
      }
      return rec(res);
    }
}
