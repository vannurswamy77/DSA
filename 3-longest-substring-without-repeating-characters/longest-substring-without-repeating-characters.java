class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0 ){
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        int left=0,result=0;
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            result=Math.max(result,i-left+1);
        }
        return result;
    }
}