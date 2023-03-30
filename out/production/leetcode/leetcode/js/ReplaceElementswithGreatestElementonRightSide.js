let replaceElements = (arr) =>{
    let nums = [];
    for (let i = 0; i < arr.length - 1; i++) {
        nums.push(greater(i , arr));
    }
    nums.push(-1);
    return nums;
}
let greater = (index,nums) => {
    let max = -Infinity;
    for (let i = index+1; i < nums.length; i++) {
        if (nums[i] > max){
            max = nums[i];
        }
    }
    return max;
}