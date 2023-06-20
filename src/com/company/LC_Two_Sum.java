package com.company;

public class LC_Two_Sum {

        public static int[] twoSum(int[] nums, int target) {

            int[] output = new int[2];
            for(int i = 0; i < nums.length; i++) {
                for(int j = i+1; j < nums.length; j++) {
                    if(nums[i] + nums[j] == target) {
                        output[0] = i;
                        output[0] = i;
                        break;
                    }
                }
            }
            return output;
        }
    public static void main(String[] args) {
//            nums = {2, 7, 11, 15, 17};
//            twoSum(nums, 9);
    }
}
