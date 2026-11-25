class Solution {
    public int characterReplacement(String s, int k) {

       int res=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> count=new HashMap<Character,Integer>();
            for(int j=i;j<s.length();j++){
                //count.put(s.charAt(j));
                //count.getOrDefault(s.charAt(j),0)+1;
                //count.getOrDefault(s.charAt(j), 0) + 1);

                count.put(s.charAt(j), count.getOrDefault(s.charAt(j), 0) + 1);
                int freq=count.get(s.charAt(j));
                if(j-i+1-freq<=k){
                    res=Math.max(res,j-i+1);
                }


            }
                    }   return res;
        
 

        
    }
}
