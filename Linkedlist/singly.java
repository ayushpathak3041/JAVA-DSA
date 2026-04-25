public class singly{
    private Node head;
    private Node tail;
    private int size;

    private singly(){
        this.size=0;
    }
    private class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
          this.value=value ;
          this.next=next;
        }
    }
    public  void insert(int value,int index){
           if(index==0){
            insertFirst(value);
           }
           if(index==size){
            insertLast(value);
           }

           Node temp = head;
           for(int i=1;i<index;i++){
            temp=temp.next;
           }
           Node node= new Node(value,temp.next);
           temp.next=node;
           size++;
    }
private void insertLast(int value) {
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }
private void insertFirst(int value) {
        Node node = new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
 public static void main(String[] args) {
        
    }
}