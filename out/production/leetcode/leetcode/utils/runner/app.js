let spiralOrder = (matrix) => {

    let res = []
    while (matrix.length) {
        const firstRow = matrix.shift();
        res.push(...firstRow);
        for (const subMatrix of matrix) {
            let lastElementOfSubMatrix = subMatrix.pop();
            if (lastElementOfSubMatrix) {
                res.push(lastElementOfSubMatrix);
            }
            subMatrix.reverse();
        }
        matrix.reverse();
    }

    return res
}
let arr = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
console.log(spiralOrder(arr));

