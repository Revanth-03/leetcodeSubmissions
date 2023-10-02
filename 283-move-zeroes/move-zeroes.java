class Solution {
    public void moveZeroes(int[] nums) {
        int nextZero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[nextZero];
                nums[nextZero++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}