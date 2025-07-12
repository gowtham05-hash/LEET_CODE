class Solution {
    public int missingNumber(int[] arr) {
        for(int i=0;i< arr.length;){     
            int index = arr[i];        
            if(arr[i] < arr.length && arr[i]!=arr[index]){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else{
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
}