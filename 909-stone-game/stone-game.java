class Solution {
    public boolean stoneGame(int[] piles) {
        int start=0,end=piles.length-1;
        Boolean alice=true;
        int al=0,bob=0;
        while(start<=end){
            if(alice){
                if(piles[start]>=piles[end]) al+=piles[start++];
                else al+=piles[end--];
            }else{
                if(piles[start]>=piles[end]) bob+=piles[end--];
                else bob+=piles[start++];
            }
            alice=!alice;
        }
        if(al>bob){
            return true;
        }
        return false;
    }
}