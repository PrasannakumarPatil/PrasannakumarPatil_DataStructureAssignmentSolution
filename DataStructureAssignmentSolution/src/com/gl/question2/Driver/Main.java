package com.gl.question2.Driver;
import com.gl.question2.Service.*;
import com.gl.question2.Model.*;
public class Main {
    public Node node;

    public static void main(String[] args) {
        BSTToSkew bstToSkew = new BSTToSkew();
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.setLeft(new Node(30));
        tree.node.setRight(new Node(60));
        tree.node.getLeft().setLeft(new Node(10));
        tree.node.getLeft().setRight(new Node(40));
        bstToSkew.RightSkewed(tree.node);
        bstToSkew.IterateRightSkewed(bstToSkew.headNode);
    }
}
