/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danis
 */
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTreeChildrenSum {
    public boolean hasChildrenSumProperty(TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return true;
        }

        int leftData = (node.left != null) ? node.left.data : 0;
        int rightData = (node.right != null) ? node.right.data : 0;

        if (node.data == leftData + rightData
                && hasChildrenSumProperty(node.left)
                && hasChildrenSumProperty(node.right)) {
            return true;
        }
        return false;
    }
}

public class Q3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);

        BinaryTreeChildrenSum childrenSum = new BinaryTreeChildrenSum();
        System.out.println("Children Sum Property: " + childrenSum.hasChildrenSumProperty(root));
    }
}
