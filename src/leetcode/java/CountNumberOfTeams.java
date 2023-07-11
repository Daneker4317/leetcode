package leetcode.java;

public class CountNumberOfTeams {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int[] increasing = new int[n];
        int[] decreasing = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (rating[i] > rating[j]) {
                    increasing[i]++;
                    counter += increasing[j];
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (rating[i] > rating[j]) {
                    decreasing[i]++;
                    counter += decreasing[j];
                }
            }
        }

        return counter;
    }
}
