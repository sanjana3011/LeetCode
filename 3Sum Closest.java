class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum=Integer.MAX_VALUE;
        int finalSum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int sum=target-nums[i];
            int start=i+1;
            int end=nums.length-1;
            while(start<end)
            {
                int tempSum=nums[start]+nums[end];
                if(closestSum>Math.abs(nums[i]+tempSum-target))
                 {
                    closestSum=Math.abs(nums[i]+tempSum-target);
                    finalSum=nums[i]+tempSum;
                 } 
                if(tempSum < sum) start++;
                else if(tempSum > sum) end--;
                else break;
            }
                  
        }    
       return finalSum; 
        
    }
}