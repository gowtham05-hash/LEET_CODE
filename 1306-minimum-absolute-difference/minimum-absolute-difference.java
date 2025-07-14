class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> a = new ArrayList<>();
        int x = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
            x = Math.min(arr[i+1]-arr[i],x);
        for(int i=0;i<arr.length-1;i++){
            if(x == arr[i+1]-arr[i])
            a.add(Arrays.asList(arr[i],arr[i+1]));
        } 
        return a;
    }
}