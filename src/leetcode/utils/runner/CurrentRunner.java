package leetcode.utils.runner;


import java.util.*;

public class CurrentRunner {
    public static void main(String[] args) {

    }

    public int numDecodings(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            counter++
        }
    }

    int index(char ch) {
        final var letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return letters.indexOf(ch) + 1;
    }

    int sum(String s) {
        int temp = index(s.charAt(0));
        if (s.length() == 2) temp+=index(s.charAt(1));
        return temp;
    }


}
