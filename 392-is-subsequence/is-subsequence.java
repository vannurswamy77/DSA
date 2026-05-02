class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int sp=0;
        for(char ch:t.toCharArray()){
            if(sp<s.length() && s.charAt(sp)==ch){
                sp++;
            }
        }
        if(sp==s.length()){
            return true;
        }else{
            return false;
        }
    }
}