public class LinkedList {
    Node head = null, tail = null;
    int size = 0;
    void add(int val){
        Node new_node = new Node(val);
        if(head == null){
            head = new_node;
            tail=new_node;
        }
        else{
            tail.next = new_node;
            tail = new_node;
        }
        size++;
    }
    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    void size(){
        System.out.println("Size: " + size);
    }
    int pop(){
        if(head == null) System.out.println("List is Empty");
        int value = head.val;
        head = head.next;
        size--;
        return value;
    }
    void peek(){
        if(head == null) throw new NullPointerException("List Is Empty");
        System.out.println("Top: " + head.val);
    }
    void isEmpty(){
        System.out.println(head == null ? "true" : "false");
    }
    void insertAt(int target, int val){
        Node temp = head;
        while(temp.val != target && temp != null) temp = temp.next;
        if(temp != null){
            Node new_node = new Node(val);
            new_node.next = temp.next;
            temp.next = new_node;
            size++;
        }
        else System.out.println("Target value" + target + " not found.");
    }
    }

class Node{
    Node next;
    int val;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}