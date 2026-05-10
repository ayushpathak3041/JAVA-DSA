
// Package declaration - both files will be in the same package
package Linkedlist;
public Singly {
    private Node head;
    private Node tail;
    private int size;

    // Changed to public so it can be instantiated
    public Singly() {
        this.size = 0;
    }

    private class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return; // Added return to avoid duplicate execution
        }
        if (index == size) {
            insertLast(value);
            return; // Added return
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    private void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    private void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        // Using the LL class from the same package (no import needed)
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.display(); // This will now work since display is uncommented

        System.out.println("\n--- Now using Singly class ---");
        Singly myList = new Singly();
        myList.insert(5, 0); // Insert at beginning
        myList.insert(15, 1); // Insert at end
        myList.insert(10, 1); // Insert in middle
        myList.display();
    }
}