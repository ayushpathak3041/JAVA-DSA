public class Circular {  // main class 
    private Node head;
    private Node tail;
 public Circular(){
    this.head=null;
    this.tail=null;
 }   


  public void insert(int val){
    Node node = new Node(val);
    if(head==null){
        head=node;
        tail=node;
        return;
    }
    tail.next=node;   
    node.next=head;
     tail=node;
  }
  // insert using recursion in question

  public void Display(){
    Node node=head;
    if(head!=null){
        do { 
            System.out.print(node.val+"->");
            node=node.next;
        } while (node!=head);
        
    }
  }
  public void Delete(int val){
    Node node = head;
    if(node==null){
        return;
    }
    if(node.val==val){
        head=head.next;
        tail.next=head;
        return;
    }
    do { 
        Node n = node.next;
        if(n.val==val){
            node.next=n.next;
            break;
        }
        node=node.next;
    } while (node!=head);
  }//-----------------------------------------------------------------
  // questions 
// check cycle
// always use this method to check cycle
  public boolean CheckCycle(){
    Node fast = head;
    Node slow = head;
    while(fast!=null && fast.next!=null){// ager hoga cycle to isi me check ho jaega 
        if(fast==slow){
            return true;
        }
    }return false ; // kyuki ager fast null huaa to wo to linear bn gya last me pahuch ggya kaise check hoga 
}//--------------------------------------------------------------------
public int lengthCycle(){
    Node fast = head;
    Node slow=head;
    while(fast!=null && fast.next!=null){
        slow= slow.next;
        fast=fast.next.next;
        if(fast==slow){
            Node temp = slow;
            int length=0;
            do { 
                temp=temp.next;
                length++;
            } while (temp!=fast);
            return length;
        }
    }
    return 0;
}
//------------------------------------
// fidn node startig point of cyccle
public Node NodeCycle(){
    Node fast= head;
    Node slow= head;
    int length=0;
    Node meetingPoint=null;
   
    while(fast!=null && fast.next!=null){
        fast= fast.next.next;
        slow=slow.next;
         
        if(fast==slow){
            meetingPoint=slow;;
            break;
        }
        //now  find start node(floyed)
    }
    if(meetingPoint==null){
        return null;
    }
    
    Node temp=meetingPoint;
    Node h = head;
    while(h!=temp){
        h=h.next;
        temp=temp.next;
    }
    return h; 
}


    private class Node{       // Node class hai 
        int val;
        Node next;
    public Node(int val){
        this.val=val;
    }    
    }
}

