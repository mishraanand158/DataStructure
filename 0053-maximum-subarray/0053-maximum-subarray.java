class Solution {
    public int maxSubArray(int[] nums) {
        
        int next = -99999999;
        int sum = -99999999; 
        
        int  j = -1;
        int currentSum = 0;
        
     for(int i = 0 ; i<nums.length;i++){
        
         currentSum  = currentSum + nums[i] ;
         
         if(currentSum > next) {
             next = currentSum ;
         }
         if(currentSum < 0){
             currentSum = 0;
         }
         
    }
        
        return next;
}
}