package Binary_Tree.spiralPrint;

import java.util.Deque;
import java.util.LinkedList;

public class spiralPrint {
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
        nt.print();

    }
}

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
    }
}
class Tree{
    Node root;

    public void print(){
        Deque<Node> deque = new LinkedList<>();
        boolean isRev = false;
        deque.add(root);
        while (!deque.isEmpty()){
            if(isRev){
                int size = deque.size();
                while (size>0){
                    Node node = deque.removeFirst();
                    System.out.print(node.data + " ");
                    if(node.right!=null) deque.addLast(node.right);
                    if (node.left!=null) deque.addLast(node.left);
                    size--;
                }
                isRev = !isRev;
            }else{
                int size = deque.size();
                while (size>0){
                    Node node = deque.removeLast();
                    System.out.print(node.data + " ");
                    if(node.left!=null) deque.addFirst(node.left);
                    if(node.right!=null) deque.addFirst(node.right);
                    size--;
                }
                isRev = !isRev;
            }
        }
    }
}