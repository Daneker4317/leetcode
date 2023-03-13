package leetcode.java;

public class ThreeConsecutiveOdds {
        public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0;i<arr.length-2;i++){
            if(res(arr[i],arr[i+1],arr[i+2])){
                return true;
            }
        }
        return false;
    }
    public boolean res(int a,int b,int c){
        return (a%2==1 && b%2==1 && c%2==1);
    }
}
