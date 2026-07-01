class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        int m=s.length();
        List<Integer> list =new ArrayList<>();
        if(n>m){
            return list;
        }
        int freq[]=new int[26];
        int curr[]=new int[26];
        // starting window
        for(int i=0;i<n;i++){
            freq[p.charAt(i)-'a']++;
            curr[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,curr)){
            list.add(0);
        }
        // sliding window
        int left=0;
        for(int i=n;i<m;i++){
            curr[s.charAt(left)-'a']--;
            curr[s.charAt(i)-'a']++;
            left++;
            if(Arrays.equals(freq,curr)){
                list.add(left);
            }
        }
        return list;
    }
}