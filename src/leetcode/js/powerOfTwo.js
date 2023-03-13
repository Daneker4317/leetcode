let powerOfTwo = (n) => {
    return n === 0 ? false : n === 1 ? true : n % 2 === 0 && powerOfFour(n / 2);
}