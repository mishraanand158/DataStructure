class Solution {
    public int climbStairs(int n) {
        // 4 
        int [] dp =  new int [n+1] ;
        dp[n] =1;
        dp[n-1] =1 ;
         fn(n ,dp) ;
        return dp[0];
        
    }
    
     public void fn(int n,int [] dp) {
         
         for(int i = n ;i>=2;i--) {
            dp[i-2] = dp[i-1] + dp[i] ;
          //   System.out.println(i + "  "+dp[i]);
         }
     }
}