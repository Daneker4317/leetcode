package leetcode.java;

public class SubtracttheProductandSumofDigitsofanInteger {
    public int subtractProductAndSum(int n) {
        int a = 1;
        int b = 0;
        while(n>0){
          int x = n%10;
          a = a * x;
          b = b + x;
          n = n / 10;
        }
        System.out.print(a + " " + b);
        return a - b;
    }
}
