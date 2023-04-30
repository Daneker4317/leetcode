/**
 * @param {number[]} spells
 * @param {number[]} potions
 * @param {number} success
 * @return {number[]}
 */
let successfulPairs = function (spells, potions, success) {
    potions.sort((a, b) => b - a);
    let n = potions.length;

    let arr = [];

    for (let i = 0; i < spells.length; i++) {
        for (let j = 0; j < n; j++) {
            if (spells[i] * potions[j] >= success) {
                arr.push(n - j);
                continue;
            }
        }
    }
    return;

};