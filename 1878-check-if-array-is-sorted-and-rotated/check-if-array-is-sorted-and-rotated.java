class Solution {
    private static int findRotate(int []nums){
        for(int i=1; i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                return i;
            }
        }
        return 0;
    }
    
    public boolean check(int[] nums) {
        // int x = findRotate(nums);
        int n = nums.length;
        int count = 0 ;
        for(int i=0; i<n; i++){
            if(nums[i] >nums[(i+1)%n]){
              count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
        
    }
}