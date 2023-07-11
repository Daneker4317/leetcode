package leetcode.java;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(digits)
                .forEach(sb::append);
        String s = String.valueOf(Integer.parseInt(sb.toString())+1);

        int [] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i)-'0';
        }
        return arr;
    }

    void reFormatString(String... str){
        //todo
        System.out.println(str.getClass());
    }

}
