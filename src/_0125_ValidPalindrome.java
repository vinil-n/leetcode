import java.util.Locale;
import java.util.Set;

// https://leetcode.com/problems/valid-palindrome/
public class _0125_ValidPalindrome {

    private static final Set<Character> validChars =
            Set.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 'B', 'C', 'D', 'E', 'F',
                    'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                    'U', 'V', 'W', 'X', 'Y', 'Z');



    public static void main(String[] args) {
        System.out.println(new _0125_ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {

        s = s.toUpperCase(Locale.ROOT);
        final var stringBuilder = new StringBuilder();
        for (var chr : s.toCharArray()) {
            if (validChars.contains(chr)) {
                stringBuilder.append(chr);
            }
        }

        final var charArray = stringBuilder.toString().toCharArray();
        var startIndex = 0;
        var endIndex = charArray.length - 1;

        while (startIndex <= endIndex) {

            if (charArray[startIndex] != charArray[endIndex]) {
                return false;
            }

            startIndex ++;
            endIndex --;
        }

        return true;
    }
}
