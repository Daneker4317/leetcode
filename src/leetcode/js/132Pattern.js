function find132pattern(nums) {
let minimums = new Array(nums.length).fill(0);
  let stack = [];

  for (let i = 0; i < nums.length; i++) {
    if (i === 0) {
      minimums[i] = 0;
    } else {
      if (nums[i] < nums[minimums[i - 1]]) {
        minimums[i] = i;
      } else {
        minimums[i] = minimums[i - 1];
      }
    }

    while (stack.length && nums[stack.at(-1)] <= nums[i]) {
      let stackTop = stack.pop();
    }

    if (stack.length) {
      if (nums[minimums[stack.at(-1)]] < nums[i]) {
        return true;
      }
    }
    stack.push(i);
  }

  return false;
};