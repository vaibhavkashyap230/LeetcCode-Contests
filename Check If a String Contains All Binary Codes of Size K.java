// https://leetcode.com/contest/biweekly-contest-27/problems/check-if-a-string-contains-all-binary-codes-of-size-k/

import java.util.*;

public class Solution
{
    private void fill(ArrayList<String> a,int k,String s)
    {
        if(k==0)
        {
            a.add(s);
            return;
        }
        
        fill(a,k-1,s+'0');
        fill(a,k-1,s+'1');
    }
    public boolean hasAllCodes(String s, int k)
    {
        if(s.length()<k)
            return false;
        
        ArrayList<String> a = new ArrayList<String>();
        fill(a,k,"");
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length()-k+1;i++)
        {
            hm.put(s.substring(i,i+k),1);
        }
        for(String i : a)
        {
            if(!hm.containsKey(i))
                return false;
        }
        return true;
    }
}