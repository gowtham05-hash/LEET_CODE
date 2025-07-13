class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == sec || num == third) {
                continue; 
            }
            if (num > first) {
                third = sec;
                sec = first;
                first = (long) num;
            } else if (num > sec) {
                third = sec;
                sec = (long) num;
            } else if (num > third) {
                third = (long) num;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}
