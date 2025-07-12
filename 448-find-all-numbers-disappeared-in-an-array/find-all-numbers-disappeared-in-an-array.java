class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i< arr.length;){
            int index = arr[i]-1;
            if(arr[i]!=arr[index]){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else{
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}