class Solution {
    public boolean isValid(String str) {
      
     Stack<Character> stack = new Stack <>();

        for(Character ch : str.toCharArray()){

            if(ch== '(' || ch == '[' || ch =='{')
            {
                stack.push(ch); 
            }
            else if (stack.isEmpty ())
            {
                return false ;
            }
            else {

                Character local =  stack.pop();

                if(local == '[' && ch != ']')
                    return false ;
                else if (local == '(' && ch != ')')
                    return false;
                else if (local == '{' && ch != '}')
                    return false; 
            }
        }

        if(stack.isEmpty ())
            return true;
        return false;
         
    }
}