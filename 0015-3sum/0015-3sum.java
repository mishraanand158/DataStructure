class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        int len  = nums.length;
        Arrays.sort(nums);
        
        for(int  i= 0;i<len-2;i++)
        {   List<Integer> list1 =new ArrayList<Integer>();
            int  l = i+1;
            int r = len-1;
            int sum_res = -(nums[i]);
            while(l<r)
            {
              if (nums[l]+ nums[r]== sum_res)
              {
                  res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                  l++;
                  r--;
              }
                 else if (nums[l]+nums[r]>sum_res)
                    r--;
                else
                    l++;
            }
         
        }
            return new ArrayList(res);
        
    }
}