import java.util.Arrays;

// https://leetcode.com/problems/majority-element/
public class _0169_MajorityElement {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
