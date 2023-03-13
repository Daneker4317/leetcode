let checkString = function(s) {
  if(s.length ===1)return true;
    let x = s.indexOf('b');
    if(x < 0)return true;
    for(let i = 1;i<s.length;i++){
      if(s[i] === 'b' && s[i-1] === 'a' && i!==x){
        return false;
      }
    }
    return s.lastIndexOf('a') < x;
};