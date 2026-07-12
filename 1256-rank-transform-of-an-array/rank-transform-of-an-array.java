class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return arr;
        }
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int rank=1;
        map.put(temp[0],rank++);
        for(int i=1;i<n;i++){
            if(temp[i]==temp[i-1]){
                continue;
            }
            map.put(temp[i],rank++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}