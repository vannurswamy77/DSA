class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch=='u'){
            return true;
        }else{
            return false;
        }
    }
    public int maxVowels(String s, int k) {
        int vowels=0;
        // strating window
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                vowels++;
            }
        }
        int ans=vowels;
        int n=s.length();
        // sliding window
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i-k))){
                vowels--;
            }
            if(isVowel(s.charAt(i))){
                vowels++;
            }
            ans=Math.max(ans,vowels);
            if(ans==k){
                return ans;
            }
        }
        return ans;
    }
}