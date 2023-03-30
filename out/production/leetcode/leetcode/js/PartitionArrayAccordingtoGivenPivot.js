let pivotArray = function(nums, pivot) {
    let n = nums.length;
    let arr = [];
    for(let i =0;i < n;i++){
      if(nums[i] < pivot){
        arr.push(nums[i]);
      }
    }
        for(let i =0;i < n;i++){
      if(nums[i]  ==  pivot){
        arr.push(nums[i]);
      }
    }
        for(let i =0;i < n;i++){
      if(nums[i] > pivot){
        arr.push(nums[i]);
      }
    }
    return arr;
};