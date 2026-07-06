class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[103];
        for(int i : nums){
            count[i]++;
        }
        int totalCount=0;
        for(int i : count){
            totalCount += (i*(i-1))/2;
        }
        return totalCount;
    }
}