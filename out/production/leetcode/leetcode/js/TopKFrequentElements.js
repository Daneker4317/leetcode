let topKFrequent =  (nums , k) => {
    let filtered= [...new Set(nums)];
    console.log(filtered);
    let map = [];
    let ans = [];
    for (let i = 0; i < filtered.length; i++) {
        map.push([filtered[i] , nums.filter(num => num === filtered[i]).length]);
    }

    map.sort((a, b) => b[1] - a[1]);

    for (let i = 0; i < k; i++) {
        ans.push(map[i][0]);
    }

    return ans;
}