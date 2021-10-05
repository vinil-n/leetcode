// https://leetcode.com/problems/reverse-integer/

public class _0007_ReverseInteger {

    public static void main(String[] args) {
        final var subject = new _0007_ReverseInteger();

        System.out.println(subject.reverse(Integer.MIN_VALUE/10));
    }

    public int reverse(int x) {

        final var isNegative = x < 0;
        var reverseLong = 0L;
        x = Math.abs(x);

        while (x > 0) {
            reverseLong = reverseLong * 10 + x % 10;
            x /= 10;
        }

        if (isNegative) {
            reverseLong *= -1;
        }

        if (reverseLong > Integer.MAX_VALUE || reverseLong < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reverseLong;
        }
    }
}
