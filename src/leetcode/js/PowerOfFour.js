let powerOfFour = (n) => {
    return n === 0 ? false : n === 1 ? true : n % 4 === 0 && powerOfFour(n / 4);
}