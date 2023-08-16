package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }
}

class Tree{
    Node root;

    public void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(Node root) {

        if(root==null) return list;

        inorderTraversal(root.left);
        list.add(root.data);
        inorderTraversal(root.right);

        return list;
    }

    public void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            Node newNode = queue.poll();
            System.out.print(newNode.data + " ");
            if(newNode.left!=null){
                queue.add(newNode.left);
            }
            if(newNode.right!=null){
                queue.add(newNode.right);
            }
        }

    }

    public int maxDepth(Node root) {
        if(root==null) return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return Math.max(l,r)+1;
    }
}

public class print {
    public static void main(String[] args) {
        Tree nt = new Tree();

        nt.root = new Node(1);
        nt.root.left = new Node(2);
        nt.root.left.left = new Node(4);
        nt.root.left.right = new Node(5);
        nt.root.left.right.left = new Node(8);
        nt.root.right = new Node(3);
        nt.root.right.left = new Node(6);
        nt.root.right.right = new Node(7);
        nt.root.right.right.left = new Node(9);
        nt.root.right.right.right = new Node(10);

//        List<Integer> preOrder = nt.inorderTraversal(nt.root);
//        System.out.println(preOrder);

        System.out.println(nt.maxDepth(nt.root));
//        nt.inOrder(nt.root);
//        nt.preOrder(nt.root);
//        nt.postOrder(nt.root);
//        nt.levelOrder(nt.root);
    }


}
