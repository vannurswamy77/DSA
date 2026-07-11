class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        char freq[]=new char[26];
        char curr[]=new char[26];
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
            curr[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(curr,freq)){
                return true;
            }
        int left=0;
        for(int right=n;right<m;right++){
            curr[s2.charAt(left)-'a']--;
            curr[s2.charAt(right)-'a']++;
            if(Arrays.equals(curr,freq)){
                return true;
            }
            left++;
        }
        return false;
    }
}