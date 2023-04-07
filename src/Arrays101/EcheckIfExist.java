package Arrays101;

import Tools.MyToys;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 *
 */
public class EcheckIfExist {
    public static void main(String[] args) {
        int[] nums = {10,2,5,3};
        System.out.println(checkIfExistV2(nums));
        MyToys.showArray(nums);
    }
    
    private static boolean checkIfExistV2(int[] nums) {
        //...
        return true;
    }

    //Approach 1: Time O(n^2), Space O(1)
    private static boolean checkIfExistV1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == 2 * nums[j])
                    return true;
            }
        }
        return false;
    }

    
}
