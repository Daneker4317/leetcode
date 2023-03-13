package leetcode.java;

public class ANumberAfteraDoubleReversal {
        public boolean isSameAfterReversals(int num) {
        if(num % 10 ==0 && num!= 0){
          while(num%10!=0){
            num = num / 10;
          }
        }
        return num == reverse(reverse(num));
    }
    public int reverse(int n){
      StringBuilder sb = new StringBuilder ();
      sb.append(n);
      sb.reverse();
      return Integer.parseInt(sb.toString());
    }
}
