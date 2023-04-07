/*  
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
package Arrays101;

import Tools.MyToys;

/**
 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(removeDuplicatesV2(nums));
        MyToys.showArray(nums);
    }

    //Approach 2: Using two pointer
    private static int removeDuplicatesV2(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
//            if (i == 0 || nums[i] != nums[k] && nums[i] != nums[k - 1]) {
//                nums[k] = nums[i];
//                k++;
//            }
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    //0 1 2 1 1 2 2 3 3 4

    //Apporach 1: Cách basic nhất, suy nghĩ đơn giản, kém hiệu quả
    //Time O(n^2), Space O(1)
    private static int removeDuplicatesV1(int[] nums) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < k - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                k--;
            }
        }
        return ++k;
    }
}
