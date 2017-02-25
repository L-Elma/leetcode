public class Solution {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    /**
    * there is one bug such like , but leetcode accepted
            _______4______
           /              \
        ___4__          ___4__
       /      \        /      \
       4      4       4       _4
                             /  \
                            4    5
       and p=q=4
    *
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val) {
        	TreeNode tmp=p;
        	p=q;
        	q=tmp;
        }
        if(p==root||q==root){
        	return root;
        }
        if(q.val<root.val){
        	return this.lowestCommonAncestor(root.left, p, q);
        }
        if(p.val>root.val){
        	return this.lowestCommonAncestor(root.right, p, q);
        }
        if(p.val<root.val && q.val>root.val){
        	return root;
        }
        if(p.val==root.val || q.val==root.val){
	        if(p.val==q.val){
	        	TreeNode searchLeft = this.lowestCommonAncestor(root.left, p, q);
        		if(searchLeft!=null){
        			return searchLeft;
        		}
        		TreeNode searchRight = this.lowestCommonAncestor(root.right, p, q);
        		return searchRight==null?root:searchRight;
	        }else if(p.val==root.val){
        		TreeNode searchLeft = this.lowestCommonAncestor(root.left, p, q);
        		return searchLeft==null?root:searchLeft;
        	}else{
        		TreeNode searchRight = this.lowestCommonAncestor(root.right, p, q);
        		return searchRight==null?root:searchRight;
        	}
        }
        return null;
    }
}