package leetcode.java;

public class NextGreaterElementI {
        public int[] nextGreaterElement(int[] arr1, int[] arr2) {
      int [] res = new int [arr1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = next(arr2 , index(arr2 , arr1[i]));
        }
            return res;
    }
    public static int index(int [] arr , int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static int next(int [] arr , int index){
        if(index + 1 == arr.length){
            return -1;
        }
        for (int i = index +1 ; i < arr.length; i++) {
            if(arr[i] > arr[index]){
                return arr[i];
            }
        }
        return -1;
    }
}
