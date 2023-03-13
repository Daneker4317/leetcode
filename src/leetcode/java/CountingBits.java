package leetcode.java;

public class CountingBits {
        public int[] countBits(int n) {
        int [] arr = new int [n+1];
        for(int i=0;i<=n;i++){
          arr[i] = count(i);
        }
        return arr;
    }
    public int count(int n){
      String str = Integer.toBinaryString(n);
      int c = 0;
      for(char ch : str.toCharArray()){
        if(ch == '1')c++;
      }
      return c;
    }
}
