import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.LinkedList;

// https://leetcode.com/problems/minimum-moves-to-convert-string/
public class _2027_MinimumMovesToConvertString {

    public static void main(String[] args) {
        final var testCases = new LinkedList<Tuple2<String, Integer>>();

        testCases.add(Tuple.of("XOOXOXOOOOXX", 3));
        testCases.add(Tuple.of("OOXOXOOOOXX", 2));

        final var subject = new _2027_MinimumMovesToConvertString();

        for (var testCase : testCases) {
            assert testCase._2 == subject.minimumMoves(testCase._1) : "Expected - " + testCase._2;
        }
    }

    public int minimumMoves(String s) {

        var result = 0;
        final var charArray = s.toCharArray();

        var i = 0;
        while (i < charArray.length) {
            if (charArray[i] == 'X') {
                result++;
                i += 3;
            } else {
                i++;
            }
        }

        return result;

    }
}
