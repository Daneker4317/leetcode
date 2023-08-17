package leetcode.java;

public class ApplyDiscountToPrices {
    public String discountPrices(String sentence, int discount) {
        StringBuilder sb = new StringBuilder();
        String [] split = sentence.split("\\s");

        for(String word : split){
            String converted = convert(word,discount);
            sb.append(converted != null ? converted : word)
                    .append(" ");
        }

        return sb.toString().trim();
    }

    String convert(String s , int discount){
        boolean dollarInStart = s.startsWith("$");
        if (!dollarInStart){
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '$'){
                return null;
            }
            if (!Character.isDigit(ch)){
                return null;
            }
            sb.append(ch);
        }

        if(sb.isEmpty()){
            return null;
        }

        double sale =  (100D - discount) / 100 ;

        String numValue = String.format("%.2f" , Double.parseDouble(sb.toString()) * sale);
        return "$".concat(numValue);
    }


}
