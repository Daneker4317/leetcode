let isPrefixOfWord = (sentence, searchWord) => {
    let str = sentence.split(' ');
    for (let i = 0; i < str.length; i++) {
        if (str[i].startsWith(searchWord)) {
            return i + 1;
        }
    }
    return -1;
};