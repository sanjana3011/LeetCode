class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int key=-1*(nums[i]+nums[j]);
                if(mp.containsKey(key) && mp.get(key)>j)
                {
                    List<Integer> arr=new ArrayList<Integer>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(key);
                    ans.add(arr);
                }
                while(j+1<nums.length && nums[j]==nums[j+1])
                {
                    j++;
                }
            }
            while(i+1<nums.length && nums[i]==nums[i+1])
            {
                i++;
            }
        }
        return ans;
    }
}