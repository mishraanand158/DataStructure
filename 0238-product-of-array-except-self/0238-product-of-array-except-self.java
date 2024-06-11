class Solution {
    public int[] productExceptSelf(int[] nums) {
      
        /*
        Input: nums = [-1,1,0,-3,3]
              Output= [0,0,9,0,0] */
        
        int [] res = new int [nums.length];
        
        int temp =1;
        for(int i = 0 ; i<nums.length;i++){
            
            res[i] = temp ;
            temp = temp * nums[i];  // [1,1,2,6]
        }
        temp = 1; 
        for(int i = nums.length-1 ; i>=0 ; i--){
            
            res[i] =  res[i] * temp ;
            temp = temp * nums [i];
            
        }
        
        return res;
        
    }
}