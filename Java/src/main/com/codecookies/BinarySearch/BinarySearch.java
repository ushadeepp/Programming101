package main.com.codecookies.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8};
        System.out.println(binarySearch(nums,8));
    }

    public static int binarySearch(int[] nums,int value){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int middle = left + (right-left)/2;
            if (nums[middle] == value){
                return middle;
            }
            if (value>nums[middle]){
                left = middle+1;
            }
            else  {
                right = middle-1;
            }

        }
        return -1;


    }
}
