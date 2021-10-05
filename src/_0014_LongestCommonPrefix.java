import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.ArrayList;

// https://leetcode.com/problems/longest-common-prefix/
public class _0014_LongestCommonPrefix {

    public static void main(String[] args) {
        final var testCases = new ArrayList<Tuple2<String[], String>>();

        testCases.add(Tuple.of(new String[]{"flower", "flow", "flight"}, "fl"));
        testCases.add(Tuple.of(new String[]{"flower"}, "flower"));
        testCases.add(Tuple.of(new String[]{"", "flower"}, ""));
        testCases.add(Tuple.of(new String[]{"flower", ""}, ""));
        testCases.add(Tuple.of(new String[]{"dog", "racecar", "flower"}, ""));
        testCases.add(Tuple.of(new String[]{"fruit", "flower"}, "f"));

        final var subject = new _0014_LongestCommonPrefix();
        for (final var testCase : testCases) {
            assert testCase._2.equals(subject.longestCommonPrefix(testCase._1)) : "Expected " + testCase._2;
        }
    }

    public String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();
        for (var i = 0; i < strs[0].length(); i++) {

            final var chr = strs[0].charAt(i);
            var done = false;
            for (var j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || chr != strs[j].charAt(i)) {
                    done = true;
                    break;
                }
            }
            if (done) {
                break;
            } else {
                result.append(chr);
            }

        }

        return result.toString();

    }
}
