class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(list,nums,result);
        return result;
    }
    public void helper(List<Integer> list,int[] arr,List<List<Integer>> result){
        if(arr.length==0){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[0]);
        helper(list,Arrays.copyOfRange(arr,1,arr.length),result);
        list.remove(list.size()-1);
        helper(list,Arrays.copyOfRange(arr,1,arr.length),result);
    }
} 