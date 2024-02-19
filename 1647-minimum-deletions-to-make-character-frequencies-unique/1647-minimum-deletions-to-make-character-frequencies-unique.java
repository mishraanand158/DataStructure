class Solution {
    public int minDeletions(String s) {
        
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i= 0;i<s.length();i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            
            }
            else
            {
                map.put(arr[i],1);
            }
        }
  
      
          PriorityQueue<Integer> pq = new PriorityQueue<>
                                      ((a,b)->Integer.compare(b,a));
          int ans = 0;
          
          for(Map.Entry<Character,Integer> it : map.entrySet()){
              pq.add(it.getValue());   
          }
      
          while(!pq.isEmpty()){
            
            int freq = pq.peek();
            pq.remove();
            if(pq.isEmpty()){
               return ans; 
            }
            
            
            if(freq ==pq.peek()){
                if(freq > 1){
                   pq.add(freq-1);
                }
              
              ans ++;
            }
            
            
          } 
              return ans;
            
        
        
    }
}