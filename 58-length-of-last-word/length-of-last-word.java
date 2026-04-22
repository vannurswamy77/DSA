class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char arr[]=s.toCharArray();
        int n=arr.length;
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
}