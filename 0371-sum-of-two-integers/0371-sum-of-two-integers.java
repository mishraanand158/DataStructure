class Solution {
    public int getSum(int a, int b) {
        
        
        return add(a,b);
    }
    
    public int add(int a, int b) {
        
        int sum =  a ^ b ;
        int carry = a & b ;
        int carryShit  = carry <<1; //means add 10 ;
        
        if(carry == 0) 
            return sum ;
        return add(sum,carryShit);
    }
}