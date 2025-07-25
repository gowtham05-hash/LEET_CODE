class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){
                int left = i+1;
                int right = nums.length-1;
                int target = -nums[i];
                while(left<right){
                    if(nums[left]+nums[right]==target){
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }
                    else if(nums[left] + nums[right] < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return res;
    }
}