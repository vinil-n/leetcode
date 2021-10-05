import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.ArrayList;

// https://leetcode.com/problems/palindrome-number/
public class _0009_PalindromeNumber {
    public static void main(String[] args) {
        final var testCases = new ArrayList<Tuple2<Integer, Boolean>>();

        testCases.add(Tuple.of(1234321, true));
        testCases.add(Tuple.of(123321, true));
        testCases.add(Tuple.of(1, true));
        testCases.add(Tuple.of(123322, false));
        testCases.add(Tuple.of(-123321, false));
        testCases.add(Tuple.of(0, true));

        final var subject = new _0009_PalindromeNumber();
        for (final var testCase : testCases) {
            assert testCase._2 == subject.isPalindrome2(testCase._1) : testCase._1 + ": expected - " + testCase._2;
        }

    }

    // converting the input to String
    public boolean isPalindrome1(int x) {

        if (x < 0) {
            return false;
        }

        var stringInput = String.valueOf(x);
        var startIndex = 0;
        var endIndex = stringInput.length() - 1;

        while (startIndex < endIndex) {

            if (stringInput.charAt(startIndex) != stringInput.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    // without converting the input to String
    public boolean isPalindrome2(int x) {

        if (x > 0) {
            final var byteArray = new byte[(int) Math.log10(x) + 1];
            var index = 0;

            while (x > 0) {
                byteArray[index++] = (byte) (x % 10);
                x = x / 10;
            }

            var startIndex = 0;
            var endIndex = byteArray.length - 1;

            while (startIndex < endIndex) {

                if (byteArray[startIndex] != byteArray[endIndex]) {
                    return false;
                }
                startIndex++;
                endIndex--;
            }

            return true;
        } else {
            return x == 0;
        }
    }
}
