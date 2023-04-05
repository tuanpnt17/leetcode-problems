package Arrays101;

import Tools.MyToys;

/**
 * Given an array nums of integers, return how many of them contain an even
 * number of digits.  *
 * Input: nums = [12,345,2,6,7896] Output: 2
 *
 * Input: nums = [555,901,482,1771] Output: 1
 */
public class FindNumbersWithEvenNumbersOfDigits {

    public static void main(String[] args) {

        int[] nums = {-1023, 3, 23, 6, 1000};

        System.out.println(findNumbersV2(nums));
    }
    
    private static int findNumbersV2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) 
                nums[i] *= -1;
            if ((nums[i] + "").length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findNumbersV1(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (countDigits(nums[i]) % 2 == 0 && countDigits(nums[i]) != 0) {
                count++;
            }
        }

        return count;
    }

    public static int countDigits(int n) {
        int count = 0;
        if (n < 0) 
            n = n * -1;
        for (int i = n; i > 0; i = i / 10) {
            count++;
        }
        return count;
    }

    
}
