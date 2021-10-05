// https://leetcode.com/problems/valid-anagram/
public class _0242_ValidAnagram {

    public static void main(String[] args) {
        final var subject = new _0242_ValidAnagram();

        subject.isAnagram("cat", "rat");
    }
    public boolean isAnagram(String s, String t) {

        var result = true;
        if (s.length() == t.length()) {
            final var charCounterArray = new int[26];

            for (var chr : s.toCharArray()) {
                charCounterArray[chr - 'a']++;
            }

            for (var chr : t.toCharArray()) {
                charCounterArray[chr - 'a']--;
            }

            for (var chrCounter : charCounterArray) {
                if (chrCounter != 0) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }

        return result;
    }
}
