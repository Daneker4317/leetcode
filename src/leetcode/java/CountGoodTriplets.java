package leetcode.java;

public class CountGoodTriplets {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
      int count = 0;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
          for(int k=0;k<arr.length;k++){
          if(i<j && j<k && Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
            count = count + 1;
          }
          }
        }
      }
      return count;
    }
}
