class Solution {
    public int findMin(int[] nums) {

        int lo=0; int hi=nums.length-1; 

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(nums[mid]>nums[mid-1] && mid>0 ) lo=mid+1;

            else hi=mid-1;

        
        }

        return nums[lo] ;
        
    }
}
