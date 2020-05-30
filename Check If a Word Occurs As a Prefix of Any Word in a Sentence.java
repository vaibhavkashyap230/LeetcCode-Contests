// https://leetcode.com/contest/weekly-contest-190/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/

public class Solution
{
    public int isPrefixOfWord(String s, String k)
    {
        String a[] = s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()<k.length())
				continue;

			if(a[i].substring(0,k.length()).equals(k))
				return i+1;
		}
		return -1;
    }
}