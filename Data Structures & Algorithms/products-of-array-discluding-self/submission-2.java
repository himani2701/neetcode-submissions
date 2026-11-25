class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];

        }

        for(int i=0;i<nums.length;i++){
            output[i]=prod/nums[i];

        }
        return output;
    }
}  
