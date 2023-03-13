/**
 * @param {string} s
 * @return {string}
 */
let frequencySort = function(s) {
 let map =  [...new Set(s)];
    let pairs = [];
    for (let i = 0; i < map.length; i++) {
        pairs.push([map[i] , count(s ,map[i])]);
    }
    pairs.sort((a, b) => b[1] - a[1]);
    let ans = '';
    for (let i = 0; i < pairs.length; i++) {
        ans+=pairs[i][0].repeat(pairs[i][1]);
    }
    return ans;
}
let count = (a , b) => {
    let counter = 0;
    for (const aElement of a) {
      if (aElement === b){
          counter++;
      }
    }
    return counter;
}