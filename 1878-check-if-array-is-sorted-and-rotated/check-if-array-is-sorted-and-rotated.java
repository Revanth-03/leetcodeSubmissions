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
        int x = findRotate(nums);
        int n = nums.length;
        int temp = 0 ;
        for(int i=1; i<n; i++){
            if(nums[(i-1+x)%n] >nums[(i+x)%n]){
                return false;
            }
        }
        return true;
        
    }
}