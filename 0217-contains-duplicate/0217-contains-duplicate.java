class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer,Integer> distinctMap = new HashMap<>();

        for(int val:nums){

            if(distinctMap.containsKey(val))
                    return true;
            else{
                distinctMap.put(val,1);
            }
        }
        return false;
    }
}