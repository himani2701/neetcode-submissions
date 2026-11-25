
class Solution {
    public boolean checkInclusion(String s1, String s2) {

      if(s2.length()<s1.length()) return false;
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
          int i=0;
        while(i<s1.length() ){

            if(arr1[i]!=arr2[i]){
                return false;
            }

            i++;
        }
return true;
        
        
    }
}
