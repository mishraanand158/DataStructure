class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> preMap = new HashMap<>();
        for(int i =0 ; i<numCourses;i++){
            preMap.put(i,new ArrayList<>());
        }
        
        for(int [] pre: prerequisites)
        {
            preMap.get(pre[0]).add(pre[1]) ;
        }
        
        // map is ready now 
        
        
        return checkCycle(preMap);
    }
    
    public boolean checkCycle(Map<Integer,List<Integer>> preMap){
        
       Set<Integer> visited = new HashSet<>();
        Set<Integer> visiting = new HashSet<>();
        for(Integer course:preMap.keySet()){
            
            if(applyDfs(preMap,course , visited,visiting))
                return false;
        }
        return true;
    }
    
    public boolean applyDfs(Map<Integer,List<Integer>> preMap , int courseID,Set<Integer> visited , Set<Integer> visiting ) {
        
        visiting.add(courseID) ;
        //  1 , 2 3 2 
        //  2 ,  1
       for(int nextCourse:preMap.get(courseID)) {
           
           if(visiting.contains(nextCourse)){
               return true;
           }
       
           
           else if(visited.contains(courseID)){
               continue;
             }
          else if (applyDfs(preMap,nextCourse , visited,visiting)) {
               
               return true; 
           }
        
       
}
         visiting.remove(courseID);
        visited.add(courseID);
        return false ;
    }
}