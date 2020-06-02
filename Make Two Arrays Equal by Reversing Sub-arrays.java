// https://leetcode.com/contest/biweekly-contest-27/problems/make-two-arrays-equal-by-reversing-sub-arrays/

import java.util.*;

public class Solution
{
    public boolean canBeEqual(int[] tar, int[] a)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<tar.length;i++)
        {
            if(hm.containsKey(tar[i]))
                hm.put(tar[i],hm.get(tar[i])+1);
            else
                hm.put(tar[i],1);
        }
        for(int i=0;i<a.length;i++)
        {
            if(!hm.containsKey(a[i]))
                return false;
            if(hm.get(a[i])==1)
                hm.remove(a[i]);
            else
                hm.put(a[i],hm.get(a[i])-1);
        }
        return true;
    }
}