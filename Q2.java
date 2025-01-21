/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsaproject;

/**
 *
 * @author danis
 */
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTreeProperties {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean endReached = false;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                endReached = true;
            } else {
                if (endReached) {
                    return false;
                }
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return true;
    }

    public boolean isFullTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
            return false;
        }
        return isFullTree(root.left) && isFullTree(root.right);
    }

    public String checkTreeType(TreeNode root) {
        boolean isComplete = isCompleteTree(root);
        boolean isFull = isFullTree(root);

        if (isComplete && isFull) {
            return "Complete and Full Tree";
        } else if (isComplete) {
            return "Complete Tree";
        } else if (isFull) {
            return "Full Tree";
        } else {
            return "Neither Complete nor Full";
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        BinaryTreeProperties properties = new BinaryTreeProperties();
        System.out.println("Tree Type: " + properties.checkTreeType(root));
    }
}

