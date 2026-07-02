class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        int freq[]=new int[26];
        int curr[]=new int[26];
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
            curr[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,curr)){
            return true;
        }
        int left=0;
        for(int i=n;i<m;i++){
            curr[s2.charAt(left)-'a']--;
            curr[s2.charAt(i)-'a']++;
            left++;
            if(Arrays.equals(freq,curr)){
                return true;
            }
        }
        return false;
    }
}