class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> map=new HashMap<>();
       HashSet<Character> set=new HashSet<>(); 
       for(int i=0;i<s.length();i++){
        char sch=s.charAt(i);
        char tch=t.charAt(i);
        if(map.containsKey(sch)){
            if(map.get(sch)!=tch){
                return false;
            }
        }
        else{
            if(set.contains(tch)){
                return false;
            }else{
                map.put(sch,tch);
                set.add(tch);
            }
        }
       }
       return true;
    }
}