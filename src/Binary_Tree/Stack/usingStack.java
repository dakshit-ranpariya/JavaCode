package Binary_Tree.Stack;


import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }
}
class Tree{
    Node root;
    public void preOrder(Node root){
        if(root == null) System.out.println("Empty");

//        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            System.out.print(root.data + " ");
//            list.add(root.data);
            if(root.right!=null){
                stack.push(root.right);
            }
            if (root.left!=null){
                stack.push(root.left);
            }
        }

//        System.out.println(list);
    }
}

public class usingStack {
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


        nt.preOrder(nt.root);
    }
}

