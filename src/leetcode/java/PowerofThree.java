package leetcode.java;

public class PowerofThree {
        public boolean isPowerOfThree(int n) {
      if(n==1)return true;
      if(n==0)return false;
      else return n%3==0 && isPowerOfThree( n / 3);
    }
}
