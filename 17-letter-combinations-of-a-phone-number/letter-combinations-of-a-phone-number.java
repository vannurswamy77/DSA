class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        String curr = "";
        helper(list, map, 0, digits, curr);
        return list;
    }

    void helper(List<String> list, HashMap<Character, String> map, int index, String digits, String curr) {
        if (index == digits.length()) {
            list.add(curr);
            return;
        }
        String alpha = map.get(digits.charAt(index));
        for (int i = 0; i < alpha.length(); i++) {
            curr += alpha.charAt(i);
            helper(list, map, index + 1, digits, curr);
            curr=curr.substring(0, curr.length() - 1);
        }
    }
}