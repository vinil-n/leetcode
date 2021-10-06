import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.LinkedList;

// https://leetcode.com/problems/single-number/
public class _0136_SingleNumber {

    public static void main(String[] args) {
        final var testCases = new LinkedList<Tuple2<int[], Integer>>();

        testCases.add(Tuple.of(new int[]{1}, 1));
        testCases.add(Tuple.of(new int[]{1, 3, 3}, 1));
        testCases.add(Tuple.of(new int[]{1, 4, 1, 4, 6}, 6));
        testCases.add(Tuple.of(new int[]{1}, 1));

        final var subject = new _0136_SingleNumber();

        for (final var testCase : testCases) {
            assert testCase._2 == subject.singleNumber(testCase._1) : "Expected : " + testCase._2;
        }
    }

    public int singleNumber(int[] nums) {
        var result = 0;

        for (final var num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
