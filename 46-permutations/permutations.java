class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        return helper(list,nums);
    }
    public List<List<Integer>> helper(List<Integer> list, int[] arr){
        List<List<Integer>> result=new ArrayList<>();
        if(arr.length==0){
            result.add(new ArrayList<>(list));
            return result;
        }
        int temp=arr[0];
        for(int i=0;i<=list.size();i++){
            list.add(i,temp);
            List<List<Integer>> temp1=helper(list,Arrays.copyOfRange(arr,1,arr.length));
            result.addAll(temp1);
            list.remove(i);
        }
        return result;
    }
}