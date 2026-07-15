class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=0;
        int osum=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                esum+=i;
            }else{
                osum+=i;
            }
        }
        if(osum>esum){
            int temp=osum;
            osum=esum;
            esum=temp;
        }
        while(osum!=0){
            int temp=osum;
            osum=esum%osum;
            esum=temp;
        }
        return esum;
    }
}