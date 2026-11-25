class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0;i<Math.min(s1.length,s2.length);i++){
            if(s1[i]!=s2[i])
            return false;
        }

        return true;

    }
}
