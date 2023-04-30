let longestPalindromic = (str)  => {
    let start = 0;
    let end = 0;
    for (let i = 0; i < str.length-1; i++) {
        for (let j = i+1; j < str.length; j++) {
            if (isPalindrome(str , i , j) && j-i > end - start){
                start = i;
                end = j;
            }
        }
    }
    return str.substring(start,end);
}
let isPalindrome = (str,i,j) =>{
    while (i < j){
        if (str.charAt(i) !== str.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
}