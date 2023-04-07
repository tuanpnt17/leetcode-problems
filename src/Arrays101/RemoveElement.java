/*
    https://leetcode.com/problems/remove-element/
 */
package Arrays101;

import Tools.MyToys;

/**
 * Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_]
 *
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2 Output: 5, nums = [0,1,4,0,3,_,_,_]
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2, 2, 5};
        int val = 2;
        System.out.println(removeElementV3(nums, val));
        MyToys.showArray(nums);
        
    }
    
    //Approach 3: The best solution (two pointer without swapping)
    private static int removeElementV3(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }    
    
    //Approach 2: Using two pointer and swap value
    //Time complexity: O(n); Space Complexity: O(1)
    private static int removeElementV2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
        }
        return i;
    }

    //Approach 1: Time O(n^2), Space O(1)
    private static int removeElementV1(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            if (nums[i] == val) {
                for (int j = i; j < k - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                k--;
                i--;
            }
        }
        return k;
    }

    
}
