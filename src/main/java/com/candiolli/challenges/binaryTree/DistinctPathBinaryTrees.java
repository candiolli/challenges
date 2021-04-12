package com.candiolli.challenges.binaryTree;

import java.util.HashMap;

class DistinctPathBinaryTrees {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);

        System.out.println(Solution.largestUinquePath(root));
    }

    static class Solution {
        static int largestUinquePathUtil(Node node, HashMap<Integer,
                Integer> m) {
            if (node == null)
                return m.size();

            // put this node into hash
            if (m.containsKey(node.data)) {
                m.put(node.data, m.get(node.data) + 1);
            } else {
                m.put(node.data, 1);
            }

            int max_path = Math.max(largestUinquePathUtil(node.left, m),
                    largestUinquePathUtil(node.right, m));

            // remove current node from path "hash"
            if (m.containsKey(node.data)) {
                m.put(node.data, m.get(node.data) - 1);
            }

            // if we reached a condition where all duplicate value
            // of current node is deleted
            if (m.get(node.data) == 0)
                m.remove(node.data);

            return max_path;
        }

        // A utility function to find long unique value path
        static int largestUinquePath(Node node) {
            if (node == null)
                return 0;

            // hash that store all node value
            HashMap<Integer,
                    Integer> hash = new HashMap<Integer,
                    Integer>();

            // return max length unique value path
            return largestUinquePathUtil(node, hash);
        }
    }

}
