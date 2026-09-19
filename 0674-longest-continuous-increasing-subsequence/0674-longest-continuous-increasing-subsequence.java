class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1)
        {
            return 1;
        }
        int max =0;
        int i =0;
        int count =1;
        for (int j =1;j<nums.length;j++)
        {          
            if(nums[j]>nums[j-1])
            {
                count++;
            }
            else
            {
                count =1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}