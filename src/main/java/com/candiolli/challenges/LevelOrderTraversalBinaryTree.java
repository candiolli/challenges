package com.candiolli.challenges;

import java.util.Scanner;

class LevelOrderTraversalBinaryTree {

    public static boolean printLevel(Node root, int level) {
        if (root == null) {
            return false;
        }

        if (level == 1) {
            System.out.print(root.key + " ");
            return true;
        }

        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return left || right;
    }

    // Function to print level order traversal of a given binary node
    public static void levelOrderTraversal(Node root) {
        int level = 1;

        while (printLevel(root, level)) {
            level++;
        }
    }

//    public static void main(String[] args)
//    {
//        Node root = new Node(15);
//        root.left = new Node(10);
//        root.right = new Node(20);
//        root.left.left = new Node(8);
//        root.left.right = new Node(12);
//        root.right.left = new Node(16);
//        root.right.right = new Node(25);
//
//        levelOrderTraversal(root);
//    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.key) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrderTraversal(root);
    }
}
