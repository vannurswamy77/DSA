class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(0,0,n,"",list);
        return list;
    }
    void helper(int open,int close,int n,String re,List<String> list){
        if(re.length()==n*2){
            list.add(re);
            return;
        }
        if(open < n){
            re+='(';
            helper(open+1,close,n,re,list);
            re=re.substring(0,re.length()-1);
        }
        if(close < open){
            re+=')';
            helper(open,close+1,n,re,list);
            re=re.substring(0,re.length()-1);
        }
        return;
    }
}