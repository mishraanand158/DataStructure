class Solution {
    public boolean isPalindrome(String s) {
        
        if (s  ==null) {
            return false;
        } 
        int start = 0 ;
        int end = s.length()-1;
        boolean res = true ;
        while(start<=end){
            
            if(!Character.isLetterOrDigit(s.charAt(start)) && !Character.isLetterOrDigit(s.charAt(end))){
                start++;
                end--;
            }
                                          else if (!Character.isLetterOrDigit(s.charAt(start))){
                                              start++;
                                          } else if(!Character.isLetterOrDigit(s.charAt(end)))
                                                   end --;
                                                   else if(checkNotEquals(Character.toLowerCase(s.charAt(start)),Character.toLowerCase(s.charAt(end)))) {
                                                       return false;
                                                   }
                                                   else {
                                                       start++;
            end--;
                                                   }
                                          
            
            
        }
        
        return res;
    
    }
    
    public boolean checkNotEquals(Character ch1,Character ch2 ) {
        
        if(((int) ch1 - (int)ch2) != 0)
            return true;
    return false ;
    
}
   
}