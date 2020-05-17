// https://leetcode.com/contest/biweekly-contest-26/problems/simplified-fractions/

class Solution
{
    public List<String> simplifiedFractions(int n)
    {
        List<String> r = new ArrayList<String>();
		if(n<2)
			return r;
		HashMap<Double,Boolean> hm = new HashMap<Double,Boolean>();
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				double x = (double)(j)/(double)(i);
				if(hm.containsKey(x))
				{
					continue;
				}
				r.add(Integer.toString(j)+'/'+Integer.toString(i));
				hm.put(x,true);
			}
		}
        return r;
    }
}