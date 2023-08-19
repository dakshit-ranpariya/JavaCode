import java.util.HashMap;

public class LRUCache {
    public static void main(String[] args) {
        LRU lru = new LRU(5);
        lru.add(1);
        lru.add(2);
        lru.add(3);
        lru.add(2);
        lru.add(4);
        lru.add(5);
        lru.add(6);
        lru.add(5);
        lru.print();
    }
}

class LRU{
    HashMap<Integer, Node> hashMap = new HashMap<>();
    DoublyLL doublyLL = new DoublyLL();
    int capacity;

    public LRU(int capacity) {
        this.capacity = capacity;
    }

    public void add(int data) {
        if (hashMap.containsKey(data)){
            if(doublyLL.isTail(data)){
                return;
            }
            Node address = hashMap.get(data);
            doublyLL.remove(address);
            hashMap.remove(data);
        }
        if (hashMap.size() == capacity){
            int d = doublyLL.removeFirst();
            hashMap.remove(d);
        }
        Node nn = doublyLL.insertLast(data);
        hashMap.put(data, nn);
    }

    public void print() {
        doublyLL.print();
    }
}

class DoublyLL{
    Node head, tail;

    public void remove(Node address) {
        if(head == address && head == tail){
            head = tail = null;
        }else if (address == head){
            head = head.next;
            head.prev = null;
        }else {
            address.prev.next = address.next;
            address.next.prev = address.prev;
        }
    }

    public Node insertLast(int data) {
        Node nn = new Node(data);
        if (head == null){
            head = tail = nn;
        }else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        return nn;
    }

    public boolean isTail(int data) {
        if (tail.data == data){
            return true;
        }
        return false;
    }

    public int removeFirst() {
        int data = head.data;
        head = head.next;
        head.prev = null;
        return data;
    }

    public void print() {
        if (head == null){
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
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