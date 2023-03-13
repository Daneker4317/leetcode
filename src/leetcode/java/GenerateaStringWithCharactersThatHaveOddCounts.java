package leetcode.java;

public class GenerateaStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
      if(n==1)return "a";
        StringBuilder sb = new StringBuilder();
        if(n%2==0){
            sb.append(generate(n-1,"x")).append(generate(1,"y"));
        }else{
          sb.append(generate(n-2,"x")).append(generate(1,"y")).append(generate(1,"z"));
        }
        return sb.toString();
    }

    public String generate(int a , String s){
      return s.repeat(a);
    }
}
