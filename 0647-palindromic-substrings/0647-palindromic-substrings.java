class Solution {
    public int countSubstrings(String s) {
        
        // abc a , b ,c ab , ac , bc, abc
        
        int count = 0;
        // (0,0)a ,(0,1) ab  (0,2) abc  1,1 // b (1,2 bc)  c
        for(int i =0 ;i <s.length() ;i++){
            for(int j = i+1 ; j<=s.length();j++){
                
                String val = s.substring(i,j) ;
              //   System.out.print(val+",");
                if(checkPalindrome(val)){
                 //   System.out.print("@"+val+" @ ");
                    count ++ ;
                }
                
                
            }
        }
        
        return count;
        
    }
    
    public boolean checkPalindrome(String palindrome){
        int i = 0;
        int j = palindrome.length()-1;
      
        while(i<j){
            if(palindrome.charAt(i)!= palindrome.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true ;
    }
}