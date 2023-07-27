package Linkedlist;

import java.util.Stack;

//1. Done   Create, insert, delete, print, update, find in singly linked list
//2. Done   Count nodes / length of linked list
//3. Done   Print linked list in reverse
//4. Done   Get nth node in linked list
//5. Done   Get nth node from end in  linked list
//6. Done   Given only a pointer to a node to be deleted in a singly linked list, how do you delete it? (head not given)
//7. Done   Create and print circular linked list without tail node
//8.        Exchange first and last nodes in Circular Linked List
//9. Done   Print middle node of the linked list
//10.Done   Remove duplicates from a sorted linked list
//11.Done   Reverse a linked list
//12.Done   Check if linked list is circular linked list
//13.Done   Count nodes in circular linked list
//14.Done   Detect loop in linked list
//15.Done   Find length of loop in linked list
//16.Done   Remove duplicates from singly linked list

public class first {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(2);
        linkedList.insert(2);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(5);
        linkedList.insert(6);
//        linkedList.reverseList();
//        linkedList.removeDup();
//        linkedList.removeDupinSorted();
//        linkedList.print();

//        linkedList.circularInsert(10);
//        linkedList.circularInsert(20);
//        linkedList.circularInsert(30);
//        linkedList.circularInsert(40);
//        linkedList.circularInsert(50);
//        System.out.println(linkedList.isCurcular());
//        System.out.println(linkedList.countNodeinCircular());
//        linkedList.printCircular();




//        linkedList.tail.next = linkedList.head.next;
//        System.out.println(linkedList.loopdetected());
//        System.out.println(linkedList.lengthofLoop());


//        linkedList.printRev();


//        System.out.println(linkedList.getnthnode(3));
//
//        System.out.println(linkedList.getnthnodefromlast(4));

//        Node del = linkedList.head.next;
//        linkedList.deletewithouthead(del);

//        System.out.println("Before Delete");
//        System.out.println();
//        linkedList.printmid();
//        linkedList.delete(30);
//        System.out.println("After Delete");
//        linkedList.print();
    }
}

class Node{
    int data;
    Node next;

    public Node(int x) {
        data = x;
    }
}
class LinkedList{
    Node head;
    Node tail;

    public void insert(int data) {
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            tail = nn;
        }else{
            tail.next = nn;
            tail = nn;
        }
    }

    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void delete(int value) {

        if(head.data == value && head == tail){
            head = null;
            tail = null;
        }else if(head.data == value){
            head = head.next;
        }else{
            Node prev = head;
            Node curr = head.next;
            while(curr.data != value){
                prev = curr;
                curr = curr.next;
            }
            prev.next = prev.next.next;
        }
    }

    public int size() {
        Node temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    public void printRev() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public int getnthnode(int value) {
        Node temp = head;

        int c = 1;
        while(temp!=null){
            if(c==value){
                return temp.data;
            }else{
                c++;
                temp = temp.next;
            }
        }
        return -1;
    }


    public int getnthnodefromlast(int value) {
        Node temp=head;
        int c=1;
        while(temp!=null){
            if(c==size()-value+1){
                return temp.data;
            }else{
                c++;
                temp=temp.next;
            }
        }
        return -1;
    }

    public void deletewithouthead(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public void printmid() {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public boolean loopdetected() {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }

    public void circularInsert(int data) {
        Node nn = new Node(data);
        if(head==null){
            head = nn;
            tail = nn;
            nn.next = head;
        }else{
            tail.next = nn;
            tail = nn;
            tail.next = head;
        }
    }

    public void printCircular() {
        Node curr = head;
        if(head==null){
            System.out.println("List is Empty");
        }else{
            System.out.println("Circular list:");
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }while (curr!=head);
        }
    }

    public void removeDup() {
        Node curr = head, index, temp;

        if(head==null){
            System.out.println("empty");
            return;
        }else{
            while(curr!=null){
                temp = curr;
                index = curr.next;

                while(index!=null){
                    if(curr.data == index.data){
                        temp.next = index.next;
                    }else{
                        temp = index;
                    }
                    index = index.next;
                }

                curr = curr.next;
            }
        }
    }

    public boolean isCurcular() {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }

    public int countNodeinCircular() {
        Node slow = head;
        Node fast = head;
        int c = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            c++;
            if (slow==fast){
                return c;
            }
        }
        return 0;
    }

    public int lengthofLoop() {
        Node slow = head;
        Node fast = head;
        int c = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            c++;
            if (slow==fast){
                return c;
            }
        }
        return 0;
    }

    public void reverseList() {
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while(prev!=null){
            System.out.print(prev.data + " ");
            prev = prev.next;
        }
    }


    public void removeDupinSorted() {
        Node curr = head;
        Node n = head.next;
        while(curr.next!=null){
            if(curr.data == n.data){
                curr.next = n.next;
            }else{
                curr = n;
            }
            n = n.next;
        }
    }
}
