class Solution {
    public String reverseVowels(String s) {
        
        int i = 0;
        int j = s.length()-1 ;            
        char [] arr = s.toCharArray() ;
        
        while(i<j)
        {
            if(isVowel(arr[i]) && isVowel(arr[j])){
                
                char temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
                //swap 
                
                i++;j--;
                
            }
            
            else if(isVowel(arr[i])){   
                j--;
            }
            
            else if(isVowel(arr[j])){
                i++;
            }
            else {
                i++;
                j--;
            }
            
        }
        
        
        return new String(arr);        
    }
    
    public boolean isVowel(char ch){
        if(ch == 'a' ||ch == 'A' ||ch == 'e' ||ch == 'E' ||ch == 'i' ||ch == 'I' ||ch == 'o' ||
           ch == 'O' ||ch == 'u' ||ch == 'U' ){
            return true ;
    }
        return false;
    }
}
