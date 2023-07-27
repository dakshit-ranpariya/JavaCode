package Doubly_LinkedList;



//17.Done   Create, insert, delete, print doubly linked list
//18.Done   Find pairs with given sum in sorted doubly linked list
//19.Done   Reverse a Doubly Linked List
//20.Done   Insert value in sorted way in a sorted doubly linked list
//21.Done   Remove duplicates from a sorted doubly linked list
//22.Done   Given only a pointer to a node to be deleted in a doubly linked list, delete it
//23.Done   Remove duplicates from doubly linked list


public class first {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.print();
//        linkedList.sortedInsert(60);

//        Node del = linkedList.head.next;
//        linkedList.deleteNode(del);
//        System.out.println();
//        linkedList.reverseDoubly();
//        linkedList.removeDupDoubly();
//        linkedList.removeDupfromSorted();


        linkedList.findPair(1000);



//        linkedList.delete(50);

//        System.out.println();
//        linkedList.printRev();

    }

}
class LinkedList{
    Node head;
    Node tail;

    public void insert(int value) {
        Node nn = new Node(value);
        if(head == null){
            head = nn;
            tail = nn;
        }else{
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }
    }

    public void print() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void printRev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void delete(int value) {
        if(head.data == value && head == tail){
            head = null;
            tail = null;
        }else if(head.data == value){
            head.next.prev = null;
            head = head.next;
        }else{
            Node prev = head;
            Node curr = head.next;
            while(curr.data != value){
                prev = curr;
                curr = curr.next;
            }
            if(curr.next == null){
                prev.next = null;
                tail = curr.prev;
            }else{
                curr.next.prev = curr.prev;
                prev.next = curr.next;
            }
        }
    }

    public void findPair(int sum) {
        Node headT = head;
        Node tailT = tail;

        while(headT!=tailT){
            int total = headT.data + tailT.data;
            if(total == sum){
                System.out.println("Pairs: (" + headT.data + "," + tailT.data + ")");
                return;
            }else if(total < sum){
                headT = headT.next;
            }else{
                tailT = tailT.prev;
            }
            System.out.println("Pair not found");
            return;
        }

    }

    public void reverseDoubly() {
        Node p = null;
        Node curr = head;
//        Node temp = tail;

        while(curr!=null){
            Node a = curr.next;
            curr.next = p;
            curr.prev = curr.next;
            p = curr;
            curr = a;
        }
        while(p!=null){
            System.out.print(p.data + " ");
//            p = p.next;
            p = p.prev;
        }
    }

    public void removeDupDoubly() {
        Node curr = head;
        Node index, temp;

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
                        if(index.next != null) {
                            index.next.prev = index.prev;
                        }
                    }else{
                        temp = index;
                    }
                    index = index.next;
                }

                curr = curr.next;
            }
        }
    }

    public void removeDupfromSorted() {
        Node curr= head;
        Node n = head.next;

        while(curr.next!=null){
            if(curr.data == n.data){
                curr.next = n.next;
                if(n.next == null){
                    return;
                }else{
                    n.next.prev = n.prev;
                }
            }else{
                curr = n;
            }
            n = n.next;
        }
    }

    public void deleteNode(Node del) {
        del.data = del.next.data;
        del.next = del.next.next;

    }

    public void sortedInsert(int value) {
        Node newNode = new Node(value);
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            if(temp.data>value){
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if(prev!=null){
            Node curr = prev.next;
            prev.next = newNode;
            newNode.next = curr;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
}
class Node{
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
    }
}
