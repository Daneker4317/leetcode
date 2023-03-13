package leetcode.java;

public class HappyNumber {
        public boolean isHappy(int n) {
        int result = n ;
          while(result != 1 && result != 4){
            result = isHappyNumber(result);
        }
        return result == 1;
    }
     public static int isHappyNumber(int num){
        int rem = 0, sum = 0;
        while(num > 0){
            rem = num%10;
            sum = sum + (rem*rem);
            num = num/10;
        }
        return sum;
}
}
