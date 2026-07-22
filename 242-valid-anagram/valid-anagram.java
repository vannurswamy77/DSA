class Solution {
    public boolean isAnagram(String s, String t) {
       int s_len=s.length();
       int t_len=t.length();
       if(s_len!=t_len){
        return false;
       } 
       char[] s_arr=new char[26];
       char[] t_arr=new char[26];
       for(int i=0;i<s_len;i++){
        s_arr[s.charAt(i)-'a']++;
        t_arr[t.charAt(i)-'a']++;
       }
       if(Arrays.equals(s_arr,t_arr)){
        return true;
       }
       return false;
    }
}