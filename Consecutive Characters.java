// https://leetcode.com/contest/biweekly-contest-26/problems/consecutive-characters/

class Solution
{
    public int maxPower(String s)
    {
        if(s.length()==0)
            return 0;
        
        int temp=1,max=1;
        char cur = s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=cur)
            {
            	cur = s.charAt(i);
                temp = 1;
            }
            else
            {
            	temp+=1;
            	if(temp>max)
            		max=temp;
            }
        }
        return max;
    }
}