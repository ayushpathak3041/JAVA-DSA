

//     private Node head;
//     private Node tail;
//     public int size ;

//     public singlypractice(){
//         this.size=0;
//     }              // -----------------   upper is our linkedlist


//     // THIS  is Node class 
//     public class Node{
//         private int value;
//         private Node next;

//         public Node(int value){
//             this.value=value;
//         }
//         public Node(int value,Node next){
//            this.value=value;
//            this.next=next;
//         }   
//     }


//     // NOW inserting element
//     // condtion check head tail
//     public void insert(int value , int index){
//         if(index==0){
//             insertFirst(value);
//             return;
//         }
//         if(tail==null){
//             insertLast(value);
//             return;
//         }
//        Node temp = head;
//        for(int i = 1;i<index;i++){
//         temp=temp.next;// current node 
//        }
//        Node node = new Node(value,temp.next);
//        temp.next=node;

//        size++;
        
//     }
    
//     private void insertLast(int value) {
//         if(tail==null){
//             insertFirst(value);// linkedlist khali hai jab hum last==first then we calling insertfirst
//             return;
//         }
//       Node node= new Node(value);
//      tail.next=node;
//      tail=node;

//     }

//     private void insertFirst(int value) {
//         Node node = new Node(value);
//         node.next=head;
//         head = node;

//         if(tail==null){
//             tail=head;
//         }
//     }


//     public static void main(String[] args) {
        
//     }
// }
public class singlypractice{
     private Node head;
     private Node tail;
     private int size;
     public singlypractice(){
           this.size=0;
     }
     public class Node{
        private int value;
        private Node next;
        public Node(int value){
             this.value = value;
        }
        public Node(int value,Node next){
         this.value=value;
         this.next=next;
        }
     }
     public void insert(int value,int index){
          if(index==0){
               insertFirst(value);
          }
          if(index==size){
               inserLast(value);
          }
          /// kyuki hame first last nhi add kena so hume chahiye temp.next jo node se judega temp hoga humara index number
          Node temp=head;
          for(int i=1;i<index;i++){     //use index tak pahuchane ke liye ye for loop hota hai jisme head/temp move kerte hue waha tak le jata hai
               temp=temp.next;
          }
        Node node = new Node(value,temp.next);
        temp.next=node;                        // |3 index|--temp.next--|node|---automatically--|4th index|
        size++;       
     }  
    private void insertFirst(int value) {
         Node node = new Node(value);
         node.next=head;
         head=node;

         if(tail==null){
          tail=head;
         }
         size=+1;
    }
     private void inserLast(int value) {
        if(tail==null){
          insertFirst(value);
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
    }
    ///////////////////////
    // we will use temp (because temp is not element of structure) 
    //❌head
    public void Display(){
          Node temp=head;
          while(temp!=null){
          System.out.print(temp.value+"-->"); 
          temp=temp.next;
          }
          System.out.println("End");
    }
    public static  void main(String[] args) {
        singlypractice list = new singlypractice();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
    }
}