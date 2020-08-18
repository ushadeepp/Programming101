package main.com.codecookies.ArrayRotation;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(arrayRotation(nums,6)));
    }

    public static int[] arrayRotation(int[] nums, int d){
        for (int i = 0; i < d; i++) {
            leftRotateByOne(nums);
        }
        return nums;
    }
    public static void leftRotateByOne(int[] nums){
        int temp = nums[0];
        int i;
        for (i = 0; i < nums.length-1; i++) {
            nums[i]=nums[i+1];
        }
        nums[i]=temp;
    }
}

