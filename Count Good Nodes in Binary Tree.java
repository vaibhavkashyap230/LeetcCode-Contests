// https://leetcode.com/contest/biweekly-contest-26/problems/count-good-nodes-in-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution
{
    private void count(TreeNode temp,int max,int c[])
    {
        if(temp==null)
            return;
        
        if(temp.val>=max)
        {
            c[0]+=1;
            max=temp.val;
        }
        count(temp.left,max,c);
        count(temp.right,max,c);
    }
    public int goodNodes(TreeNode root)
    {   
        if(root==null)
            return 0;
        
        int c[] = new int[1];
        c[0] = 1;
        count(root.left,root.val,c);
        count(root.right,root.val,c);
        return c[0];
    }
}