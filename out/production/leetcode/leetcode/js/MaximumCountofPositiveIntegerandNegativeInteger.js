let maximumCount = (nums) => {
    let pos = nums.filter(num => num > 0).length;
    let neg = nums.filter(num => num < 0).length;
    return Math.max(pos , neg);
}