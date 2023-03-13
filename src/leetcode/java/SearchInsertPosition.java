package leetcode.java;

public class SearchInsertPosition {
        public int searchInsert(int[] array, int target) {
        int low = 0;
    int high = array.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    for(int i=0;i<array.length;i++){
      if(array[i] > target){
        return i;
      }
    }
    return array.length;
    }
}
