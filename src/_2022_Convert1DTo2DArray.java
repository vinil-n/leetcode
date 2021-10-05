// https://leetcode.com/problems/convert-1d-array-into-2d-array/

import io.vavr.Tuple;
import io.vavr.Tuple3;

import java.util.LinkedList;

public class _2022_Convert1DTo2DArray {

    public static void main(String[] args) {
        final var testCases = new LinkedList<Tuple3<int[], Integer, Integer>>();

        testCases.add(Tuple.of(new int[]{1, 2, 3, 4, 5, 6}, 3, 2));

        final var subject = new _2022_Convert1DTo2DArray();

        for (var testCase : testCases) {
            subject.construct2DArray(testCase._1, testCase._2, testCase._3);
        }
    }

    public int[][] construct2DArray(int[] original, int m, int n) {

        int[][] result = null;
        if (original.length == m * n) {
            result = new int[m][n];
            var index = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = original[index++];
                }
            }
        } else {
            result = new int[0][0];
        }
        return result;
    }
}
