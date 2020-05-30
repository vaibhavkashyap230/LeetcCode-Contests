// https://leetcode.com/contest/weekly-contest-190/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

public class Solution
{
    public int maxVowels(String s, int k)
    {
        int mc=0,c=0;
		for(int i=0;i<k;i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				mc+=1;
		}
		c=mc;
		for(int i=k;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				c+=1;
			if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e'|| s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u')
				c-=1;
			
			if(c>mc)
				mc=c;
		}
		return mc;
    }
}