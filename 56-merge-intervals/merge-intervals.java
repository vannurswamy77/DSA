class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int r=intervals.length,c=intervals[0].length;
        int[] prev=intervals[0];
        for(int i=1;i<r;i++){
            if(prev[1]>=intervals[i][0]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }else{
                list.add(prev);
                prev=intervals[i];
            }
        }
        list.add(prev);
        int[][] re=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            int j=0;
            for(int num:list.get(i)){
                re[i][j++]=num;
            }
        }
        return re;
    }
}