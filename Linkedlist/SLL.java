package Linkedlist;

public class SLL {

    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value, int index) {

        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public int deleteFirst() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int val = head.value;//Sach ye hai ki value save karna zaroori nahi hota. Ye isliye kiya jata hai kyunki method ka return type int hai aur hume deleted node ki value wapas deni hai.
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public Node get(int index){
        Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node; 
        
    }public int delete(int index) {

    // Agar user index 0 delete karna chahta hai
    // Example:
    // 10 -> 20 -> 30
    // ^
    // index 0
    if (index == 0) {
        return deleteFirst();
    }

    // size - 1 kyun?
    //
    // Maan lo size = 4 hai
    //
    // Index:  0   1   2   3
    //         10  20  30  40
    //
    // Last index hamesha size - 1 hota hai
    // kyunki indexing 0 se start hoti hai
    //
    // size = 4
    // last index = 3
    //
    // isliye:
    if (index == size - 1) {
        return deleteLast();
    }

    // Delete hone wali node ke just pehle wali node lao
    //
    // Example:
    // delete(2)
    //
    // 10 -> 20 -> 30 -> 40
    //       ^
    //      prev
    //
    Node prev = get(index - 1);

    // Delete hone wali node ki value save kar lo
    //
    // prev.next = 30
    //
    int val = prev.next.value;

    // Actual deletion
    //
    // Before:
    // 10 -> 20 -> 30 -> 40
    //       ^
    //      prev
    //
    // prev.next      = 30
    // prev.next.next = 40
    //
    // 20 ko direct 40 se connect kar do
    //
    prev.next = prev.next.next;

    // Ek node delete hui hai
    // isliye size 1 kam kar do
    //
    // Before size = 4
    // After  size = 3
    //
    size--;

    // Deleted value return karo
    return val;
}
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);// because from last 2nd node
        int val=tail.value;//Sach ye hai ki value save karna zaroori nahi hota. Ye isliye kiya jata hai kyunki method ka return type int hai aur hume deleted node ki value wapas deni hai.
        //"Jo node delete hone wali hai, uski value pehle yaad rakh lo, kyunki delete ke baad us tak pahunchna mushkil ya impossible ho sakta hai."
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }




    //Questions Remove duplicates Leetcode 83
    public void Duplicate(){
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
            
        }
        tail=node;
        tail.next=null;
    }



// Merge Question 21
public static SLL MergeList(SLL first,SLL second){ // 
    // Return type LL means this method is expected to return a linked-list object
    // (presumably of class LL) that represents the merged result of `first` and
    // `second`.
    // Alternatives:
    // - void: if you merge into one of the input lists in-place and don't need
    //   to return a new object.
    // - int (or other primitive): if you only wanted to return some numeric
    //   information about the merge (e.g., length), but not a list itself.
    // Keeping LL as the return type is appropriate when you want the merged
    // linked list object back from the method.
            Node f = first.head;
            Node s =second.head;

            SLL ans = new SLL(); // call kiya hai 
            
            while (f!=null && s!=null) { 
                if(f.value<s.value){
                    ans.insertLast(f.value);
                    f=f.next;
                }
                else{
                    ans.insertLast(s.value);
                    s=s.next;
                }
            }
            while(f!=null){
                ans.insertLast(f.value);
                f=f.next;
            }
            while(s!=null){
                ans.insertLast(s.value);
                s=s.next;
            }
            return ans;//because we need merged linked list;

}


    public static void main(String[] args) {
        //  SLL list = new SLL();
        // list.insertFirst(10);
        // list.insertFirst(10);
        // list.insertFirst(8);
        // list.insertFirst(8);
        // list.insertFirst(7);
        // list.insertFirst(4);
        // list.insertFirst(4);
        // list.insertFirst(4);
        // list.insertFirst(4);
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.display();
        // list.Duplicate();
        // list.display(); // ye add karo


        SLL first = new SLL();// we are calling methods to merge then so we are using this claass because it contains insert and insert last
        SLL second =new SLL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);


        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        SLL ans = SLL.MergeList(first, second);
        ans.display();
        
        

        

    }


}