/*
https://leetcode.com/problems/merge-sorted-array/
 */
package Arrays101;

import Tools.MyToys;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n.
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output:
 * [1,2,2,3,5,6]
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0 Output: [1]
 *
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1 Output: [1]
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0)
                m++;
        }
        int[] nums2 = {1};
        int n = nums2.length;
        mergeV2(nums1, m, nums2, n);
        MyToys.showArray(nums1);
    }
    
    private static void mergeV2(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[len] = nums1[i];
                i--;
            } else {
                nums1[len] = nums2[j];
                j--;
            }
            len--;
        }
        
    }


    private static void mergeV1(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[i] > nums1[j]) {
                    int t = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = t;
                }
            }
        }
    }

    
}
