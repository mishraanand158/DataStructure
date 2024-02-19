class Solution:
    def minCost(self, s: str, cost: List[int]) -> int:
        
        prev_val = cost[0]
        prev =s[0]
        res =0
        
        for i in range(1,len(s)):
            if s[i]==prev:
                res+=min(prev_val,cost[i])
                prev_val=max(prev_val,cost[i])
                
            else :
                prev_val=cost[i]
                
            prev=s[i]
        
        
        return res