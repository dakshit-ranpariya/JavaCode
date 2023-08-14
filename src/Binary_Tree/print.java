package Binary_Tree;
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

        nt.inOrder(nt.root);
    }

}
