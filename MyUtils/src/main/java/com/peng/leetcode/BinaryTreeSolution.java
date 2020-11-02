package com.peng.leetcode;


import com.peng.leetcode.bo.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author peng.wang
 * @Description 二叉树
 * @createTime 2020/6/15
 */
public class BinaryTreeSolution {

    /**
     * 对称二叉树
     * <p>
     * leetcode  101
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return false;
        }
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }

    /**
     * 二叉树最大深度
     * <p>
     * leetcode 104
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);

        return Math.max(leftMaxDepth, rightMaxDepth);

    }

    /**
     * 翻转二叉树
     * <p>
     * leetcode226
     * 解题思路递归
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    /**
     * 路径总和
     * <p>
     * leetcode 437
     * 解题思路递归
     *
     * @param root
     * @param sum
     * @return
     */
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int result = countPathSum(root, sum);
        int leftSum = pathSum(root.left, sum);
        int rightSum = pathSum(root.right, sum);
        return result + leftSum + rightSum;
    }

    private int countPathSum(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }
        sum = sum - root.val;
        int result = sum == 0 ? 1 : 0;
        return result + countPathSum(root.left, sum) + countPathSum(root.right, sum);

    }

    /**
     * 转换累加数
     * <p>
     * leetcode 538
     * <p>
     * 反向中序遍历，即右——中——左
     */
    int bstSum = 0;

    public TreeNode convertBST(TreeNode root) {

        if (root != null) {
            convertBST(root.right);
            bstSum += root.val;
            root.val = bstSum;
            convertBST(root.left);
        }

        return root;
    }

    int diameterOfBinaryTree = 1;

    public int diameterOfBinaryTree(TreeNode root) {

        diameterOfBinaryTreeDepth(root);
        return diameterOfBinaryTree - 1;
    }

    public int diameterOfBinaryTreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = diameterOfBinaryTreeDepth(root.left);
        int rightDepth = diameterOfBinaryTreeDepth(root.right);
        diameterOfBinaryTree = Math.max(diameterOfBinaryTree, leftDepth + rightDepth + 1);
        return Math.max(leftDepth, rightDepth) + 1;

    }

    /**
     * 94 中序遍历（非递归）
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;

    }


    /**
     * 98 验证二叉搜索树
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {


        return dfsValidateBST(root, null, null);

    }

    public boolean dfsValidateBST(TreeNode root, Integer min, Integer max) {

        if (root == null) {
            return true;
        }
        int value = root.val;
        if (min != null && value <= min) {
            return false;
        }
        if (max != null && value >= max) {
            return false;
        }
        if (!dfsValidateBST(root.right, value, max)) {
            return false;
        }
        if (!dfsValidateBST(root.left, min, value)) {
            return false;
        }
        return true;
    }

    /**
     * 102 二叉树层序遍历
     * <p>
     * 层序遍历，使用队列
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        //放到最后
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                //取出第一个
                TreeNode treeNode = queue.pop();
                temp.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            result.add(temp);
        }
        return result;
    }

    /**
     * 105 从前序遍历与中序遍历构造二叉树
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        //边界值
        if (preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        //存储中序map，方便查找
        Map<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }

        return buildTreeDfs(inOrderMap, preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode buildTreeDfs(Map<Integer, Integer> inOrderMap, int[] preOrder, int[] inOrder,
                                 int preOrderLeft, int preOrderRight, int inOrderLeft, int inOrderRight) {

        if (preOrderLeft > preOrderRight) {
            return null;
        }
        int preOrderRootIndex = preOrderLeft;
        int inOrderRootIndex = inOrderMap.get(preOrder[preOrderRootIndex]);

        TreeNode root = new TreeNode(preOrder[preOrderRootIndex]);

        int leftSubTreeSize = inOrderRootIndex - inOrderLeft;

        root.left = buildTreeDfs(inOrderMap, preOrder, inOrder, preOrderLeft + 1,
                preOrderLeft + leftSubTreeSize, inOrderLeft, inOrderRootIndex - 1);

        root.right = buildTreeDfs(inOrderMap, preOrder, inOrder, preOrderLeft + leftSubTreeSize + 1,
                preOrderRight, inOrderRootIndex + 1, inOrderRight);


        return root;
    }

    /**
     * 114 二叉树展开为链表
     *
     * @param root
     */
    public void flatten(TreeNode root) {

        while (root != null) {
            if (root.left == null) {
                root = root.right;
            } else {
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
    }

    /**
     * 236 二叉树最近公共祖先
     *
     *  思路：
     * 1、在左、右子树中分别查找是否包含p或q，如果（两种情况：左子树包含p，右子树包含q/左子树包含q，右子树包含p），
     *   那么此时的根节点就是最近公共祖先
     * 2、如果左子树包含p和q，那么到root->left中查找，最近公共祖先在左子树里面
     * 3、如果右子树包含p和q，那么到root->right中查找，最近公共祖先在右子树里面
     * 4、注意：不可能left和right的返回值同时都是null
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||p==root||q==root){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        return left==null?right:left;

    }

}
