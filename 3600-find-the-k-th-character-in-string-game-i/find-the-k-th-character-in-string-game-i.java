class Solution {
    public char kthCharacter(int k) {
        String word="a";
        while(word.length() < k){
            String neww = "";
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(ch=='z'){
                    neww+='a';
                }else{
                    neww+=(char)(ch+1);
                }
            }
            word+=neww;
        }
        return word.charAt(k-1);
    }
}