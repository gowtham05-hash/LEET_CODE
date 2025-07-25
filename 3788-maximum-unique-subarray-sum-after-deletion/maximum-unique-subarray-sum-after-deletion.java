class Solution {
    public int maxSum(int[] nums) {
        int sum=0;
        Set<Integer> unique = new HashSet<>();
        int maxNeg = Integer.MIN_VALUE;
        for(int num:nums){
            if(num>0){
                if(unique.add(num)){
                    sum+=num;
                }
            }
            else{
                maxNeg = Math.max(maxNeg,num);
            }
        }
        return sum > 0 ? sum : maxNeg;
    }
}