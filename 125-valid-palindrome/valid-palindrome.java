class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        String revese=new StringBuilder(s).reverse().toString();
        return s.equals(revese);
    }
}