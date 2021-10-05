import java.util.HashMap;

public class _0001_TwoSum {

    public static void main(String[] args) {
        final var subject = new _0001_TwoSum();
        final var result = subject.twoSum(new int[]{1,2,3,4,5,6,7}, 7);
        System.out.println(result[0] + ":" + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {

        final var numPosMap = new HashMap<Integer, Integer>();

        for (var i = 0; i < nums.length; i++) {

            if (numPosMap.containsKey(target - nums[i])) {
                return new int[]{i, numPosMap.get(target - nums[i])};
            }
            numPosMap.put(nums[i], i);
        }
        return null;
    }
}
