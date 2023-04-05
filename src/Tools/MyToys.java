/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.util.*;

/**
 *
 * @author AN515-57
 */
public class MyToys {
    public static int[] autoGeneratePositiveArray(int range, int size) {
        int[] nums = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            nums[i] = r.nextInt(range);
        }
        return nums;
    }
    public static int[] autoGenerateNaturalArray(int range, int size) {
        int[] nums = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            nums[i] = r.nextInt(range * 2) - range;
        }
        return nums;
    }
    
    public static void showArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
