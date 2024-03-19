import java.util.HashSet;
import java.util.Set;
class Solution {
   public  int lengthOfLongestSubstring(String s) {
		if(s==null || s.equals(""))
		{
			return 0;
		}
		
	Set <Character> distinctvalue	= new HashSet<>();
	int end = 0;
	int maxLength = 0;
	int start = 0;
       
    // "pwwkew"    
	while(end<s.length())
	{
		if(distinctvalue.add(s.charAt(end)))
		{
			end++;
			maxLength = Math.max(maxLength, distinctvalue.size());
		}
		else {
			distinctvalue.remove(s.charAt(start));
			start ++;
		}
		
	}
		
		return maxLength;
	}

}