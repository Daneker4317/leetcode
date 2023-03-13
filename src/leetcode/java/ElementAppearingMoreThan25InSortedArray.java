package leetcode.java;

public class ElementAppearingMoreThan25InSortedArray {
        public int findSpecialInteger(int[] arr) {
        int res = arr.length/4+1;
        if(arr.length==1)return arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    res--;
                    if(res<=0)return arr[i];
                }else{
                    res = arr.length/4+1;
                }
            }
        }
        return 1;
    }
}
