class Solution {
    public int fib(int n) {
        
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        int arr[] = new int[n+1]; // n =3 // length =4  01, 1,2,3
        arr[1] = 1;
        arr[0] =0;
        
        
        fibAns(n,2,arr);
        
        return arr[n];
    }
    //2,0
   public void fibAns(int n, int i,int arr[]){
           
        if(n>=i){
            arr[i] = arr[i-1]+arr[i-2];
        
            fibAns(n,i+1,arr);  
        }
    }
    
}