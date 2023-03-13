class Solution {
public:
    int percentageLetter(string s, char letter) {
     int value = counter(s,letter);
     int res = value * 100;
     return res/s.size(); 
    }
    int counter(string s,char letter){
      return count(s.begin(),s.end(),letter);
    }
    
};