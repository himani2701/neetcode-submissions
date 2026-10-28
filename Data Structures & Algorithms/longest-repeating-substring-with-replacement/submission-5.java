class Solution {
    public int characterReplacement(String s, int k) {
        
 int l=0; int maxf=0; int res=0;
 HashMap<Character,Integer> count=new HashMap<Character,Integer>();

 for(int r=0;r<s.length();r++){
count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
int freq= count.get(s.charAt(r));
 maxf=Math.max(freq,maxf);

 if(r-l+1-maxf>k){
     count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
    l++;
 }
  else  res=Math.max(res,r-l+1);

 }

 return res;


        
    }
}
