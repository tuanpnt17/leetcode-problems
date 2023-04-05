/*
    https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
 */
package Arrays101;

import Tools.MyToys;
import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 *
 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100]
 *
 * Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
 * 
 * Approach 1:
 *  +/ Bình phương tất cả entry
 *  +/ Sort array
 * 
 * Approach 2:
 *  +/ Tạo một mảng phụ để lưu kết quả
 *  +/ dùng two pointer (1 đầu 1 cuối) duyệt từ cuối lên đầu
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-9,-7,-3,2,3,11,12};
        sortedSquareV2(nums);
        MyToys.showArray(nums);
    }
    
    private static void sortedSquareV2(int[] nums) {
        int[] temp = new int[nums.length];
        int head = 0;
        int tail = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[head]) < Math.abs(nums[tail])) {
                temp[i] = nums[tail] * nums[tail];
                tail--;
            } else {
                temp[i] = nums[head] * nums[head];
                head++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
        temp = null;
    }

    private static void sortedSquareV1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
            
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }

    
}
