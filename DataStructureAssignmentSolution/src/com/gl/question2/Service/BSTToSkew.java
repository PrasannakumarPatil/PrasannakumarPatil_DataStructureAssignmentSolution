package com.gl.question2.Service;

import com.gl.question2.Model.Node;

public class BSTToSkew {


    public static Node prevNode = null;
    public static Node headNode = null;



    //bst to skewed tree in ascending order
    public void RightSkewed(Node root) {

        // Base Case
        if (root == null) {
            return;
        }

        RightSkewed(root.getLeft());

        Node rightNode = root.getRight();


        //checking if root node(skewed tree) is undefined
        if (headNode == null) {
            headNode = root;
        } else {
            prevNode.setRight(root);
        }

        root.setLeft(null);
        prevNode = root;


        RightSkewed(rightNode);
    }

    public void IterateRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        IterateRightSkewed(root.getRight());
    }
}