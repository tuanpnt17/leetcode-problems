/*
    https://leetcode.com/problems/max-consecutive-ones/
 */
package Arrays101;

/**
 *
 * @author AN515-57
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount)
                    maxCount = count;
            } else {
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            }
        }
        return maxCount;
    }
}
