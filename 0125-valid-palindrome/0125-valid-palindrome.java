class Solution {
    public boolean isPalindrome(String str) {
        
        if (str ==null) {
            return false;
        }
        String s = str.toLowerCase();
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
                                                   else if(s.charAt(start) != s.charAt(end)){
                                                       return false;
                                                   }
                                                   else {
                                                       start++;
            end--;
                                                   }
                                          
            
            
        }
        
        return res;
    
    }
}