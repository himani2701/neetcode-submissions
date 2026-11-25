class Solution {
    public int findMin(int[] nums) {

        int lo=0; int hi=nums.length-1;  int ans=0;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1] && mid>0 && mid<nums.length-1 ) ans=mid;

            else if (nums[mid]<nums[mid-1] && nums[mid]>nums[mid+1] && mid>0 && mid<nums.length-1 )  lo=mid+1;

            else hi=mid-1;

        
        }

        return nums[ans] ;
        
    }
}
