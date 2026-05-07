class Solution {
    public boolean isValid(String s) {
        Stack sta=new Stack();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                sta.push(ch);
            }
            else{
                if(sta.isEmpty()){
                    return false;
                }
                if((ch==')' && sta.peek().equals('(')) ||(ch=='}' && sta.peek().equals('{'))|| (ch==']' && sta.peek().equals('[')) ){
                    sta.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!sta.isEmpty()){
            return false;
        }
        return true;
    }
}