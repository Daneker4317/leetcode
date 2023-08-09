package leetcode.java;

import leetcode.utils.runner.CurrentRunner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Queue<ZeroPoint> queue = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new ZeroPoint(i, j));
                }
            }
        }
        queue.forEach(zeroPoint -> {
            setZeroToColumn(matrix, zeroPoint.j);
            setZeroToRow(matrix, zeroPoint.i);
        });
    }

    void setZeroToColumn(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }
    }

    void setZeroToRow(int[][] arr, int row) {
        Arrays.fill(arr[row], 0);
    }

    record ZeroPoint(int i, int j) {
    }
}
