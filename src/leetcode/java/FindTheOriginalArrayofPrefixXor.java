package leetcode.java;

public class FindTheOriginalArrayofPrefixXor {
    public int[] findArray(int[] pref) {
       int len = pref.length;
        int[] ans = new int[len];
        ans[0] = pref[0];
        int value = ans[0];
        for(int i = 1; i < len; i++) {
            ans[i] = (value ^ pref[i]);
            value = (value ^ ans[i]);
        }
        return ans;
    }
}
