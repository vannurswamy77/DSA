class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        List<int[]> re=new ArrayList<>();
        int i;
        for(i=0;i<intervals.length;i++){
            if(intervals[i][0]>=newInterval[0]){
                break;
            }
            list.add(intervals[i]);
        }
        list.add(newInterval);
        for(int j=i;j<intervals.length;j++){
            list.add(intervals[j]);
        }
        int[][] arr=list.toArray(new int[0][]);
        int[] prev=arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i][0]<=prev[1]){
                prev[1]=Math.max(arr[i][1],prev[1]);
            }else{
                re.add(prev);
                prev=arr[i];
            }
        }
        re.add(prev);
        return re.toArray(new int[0][]);
    }
}