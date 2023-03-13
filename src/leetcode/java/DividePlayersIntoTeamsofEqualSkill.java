package leetcode.java;

import java.util.Arrays;

public class DividePlayersIntoTeamsofEqualSkill {
    public long dividePlayers(int[] skill) {
    int n = skill.length;
    long res = 0;
    Arrays.sort(skill);
    int sum = skill[0] + skill [n-1];
    res = skill[n - 1] * (long) skill[0];
    int i=1;
    int j = n-2;
    while(i<j){
        int key = skill[i] + skill [j];
        if(key!=sum){
            return -1;
        }
        res = res + ((long) skill[i++] * skill[j--]);
    }
    return res;
    }
}
