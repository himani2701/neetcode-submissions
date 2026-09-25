class Solution {
    public int trap(int[] height) {
        int n=height.length;
//left max subarray
int[] leftmax=new int[height.length];
leftmax[0]=height[0];
for(int i=1;i<height.length;i++){
    leftmax[i]=Math.max(height[i],leftmax[i-1]);
}
//right max subarray
int[] rightmax=new int[height.length];
rightmax[n-1]=height[n-1];
for(int i=n-2;i>=0;i--){
   rightmax[i]=Math.max(height[i],rightmax[i+1]);
}
int water=0;
for(int i=0;i<n;i++){
    int bar=Math.min(leftmax[i],rightmax[i])-height[i];
    water+= bar*1;

}  return water;
        
    }
}
