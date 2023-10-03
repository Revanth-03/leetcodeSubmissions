class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index = 1;
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]!=nums[i]){
                nums[index++] = nums[i];
            }
            // if(nums[i-1]!=nums[i] && i == nums.length-1){
            //     nums[index] = nums[i];
            //     if(nums.length%2==0){
            //         index++;
            //     }
            // }
            // if(i == nums.length-1 && nums[i-1]==nums[i]){
            //     nums[index++] = nums[i];
            // }
        }
        
        return index;
        
    }
}