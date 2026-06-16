public class DLL {
Node head;
public void insertFirst(int val){
  Node node = new Node(val);
  node.next=head;
  node.prev=null;
  if(head!=null){
    head.prev=node;
  }
  head=node;
}
public void insertLast(int val){
  Node node=new Node(val);// node Node to add in last we have to create (that's why i am calling when we have to add anywhere we have to create a node that's why we are here creating from calling constructer)
  Node Last=head; // temp varibale to move 
  node.next=null;// last me hoga uska to null hi hoga 
  if(head==null ){
    node = head;
    node.prev=null;
  }
  while(Last.next!=null){
    Last=Last.next;
  }
  Last.next=node;
  node.prev=Last;
  Last=node;
}


public  Node Find(int value){
      Node node=head;
      while(node!=null){
          if(node.val==value){
           return node;
      }
      node=node.next;
      }
      return null;
}


public void InstertMid (int after/*5*/,int val){
 
  Node p=Find(after);
   if(p==null){
    System.out.println("Does not exist");
    return;
   }
 Node node = new Node(val);//created a new box
 node.next=p.next;
 p.next=node;
 node.prev=p;
if(node.next!=null){
   node.next.prev=node;// ghuma ke liya hai 
}
}
public void Display(){
     Node node = head;
     while(node!=null){
        System.out.println(node.val+"->");
        node.next=node;
     }
}
public void DisplayReverse(){
   Node node=head;
   Node last = null;
   while(node!=null){
    System.out.print(node.val+"->");
    last=node;
    node=node.next;
   }
   System.out.println("End");
   System.out.println("Reverse LL\n");
   while(last!=null){
     System.out.print(last.val+"->");
     last=last.prev;
   }
   System.out.print("Start");
}
    private class Node{

     int val;
    Node next ;
    Node prev;


    public Node (int val){
        this.val=val;
    }
    public Node(int val,Node next,Node prev){
        this.val=val;
        this.next=next;
        this.prev=prev;
    }
    }
}








/*
=========================================================
DOUBLY LINKED LIST QUICK REVISION
=========================================================

NODE STRUCTURE

+----------------------+
| val | prev | next    |
+----------------------+

Example:

+----------------------+
| 20  | 10   | 30      |
+----------------------+

Meaning:

val  = 20
prev = 10 wala node
next = 30 wala node

---------------------------------------------------------
GOLDEN RULE
---------------------------------------------------------

new Node(...)      => Node banata hai

node.next = ...    => Aage connection banata hai

node.prev = ...    => Piche connection banata hai

head = node        => Head shift karta hai

Last = Last.next   => Traversal karta hai

Constructor chain nahi banata.
Constructor sirf node banata hai.

=========================================================
CONSTRUCTOR 1
=========================================================

Node node = new Node(10);

public Node(int val){

    this.val = val;
    // Value assign hui
    //
    // +----------------------+
    // | 10  | null | null    |
    // +----------------------+
}

=========================================================
CONSTRUCTOR 2
=========================================================

Node node = new Node(20,node30,node10);

public Node(int val, Node next, Node prev){

    this.val = val;
    // +----------------------+
    // | 20  | ?    | ?       |
    // +----------------------+

    this.next = next;
    // +----------------------+
    // | 20  | ?    | 30      |
    // +----------------------+

    this.prev = prev;
    // +----------------------+
    // | 20  | 10   | 30      |
    // +----------------------+
}

Final:

+----------------------+
| 20  | 10   | 30      |
+----------------------+

=========================================================
insertFirst(10)
=========================================================

Node node = new Node(10);

Create Node

+----------------------+
| 10  | null | null    |
+----------------------+

head = node;

head
 ↓

+----------------------+
| 10  | null | null    |
+----------------------+

=========================================================
insertFirst(5)
=========================================================

Current List

head
 ↓

+----------------------+
| 10  | null | null    |
+----------------------+

---------------------------------------------------------
Node node = new Node(5);
---------------------------------------------------------

Create Node

+----------------------+
| 5   | null | null    |
+----------------------+

---------------------------------------------------------
node.next = head;
---------------------------------------------------------

+----------------------+
| 5   | null | 10      |
+----------------------+

head
 ↓

+----------------------+
| 10  | null | null    |
+----------------------+

---------------------------------------------------------
node.prev = null;
---------------------------------------------------------

+----------------------+
| 5   | null | 10      |
+----------------------+

---------------------------------------------------------
head.prev = node;
---------------------------------------------------------

+----------------------+
| 10  | 5    | null    |
+----------------------+

---------------------------------------------------------
head = node;
---------------------------------------------------------

head
 ↓

+----------------------+
| 5   | null | 10      |
+----------------------+
          ↕
+----------------------+
| 10  | 5    | null    |
+----------------------+

FINAL

null <- [5] <-> [10] -> null

=========================================================
insertLast(20)
=========================================================

Current List

head
 ↓

+----------------------+
| 5   | null | 10      |
+----------------------+
          ↕
+----------------------+
| 10  | 5    | null    |
+----------------------+

---------------------------------------------------------
Node node = new Node(20);
---------------------------------------------------------

Create Node

+----------------------+
| 20  | null | null    |
+----------------------+

---------------------------------------------------------
Node Last = head;
---------------------------------------------------------

Last
 ↓

+----------------------+
| 5   | null | 10      |
+----------------------+

---------------------------------------------------------
node.next = null;
---------------------------------------------------------

+----------------------+
| 20  | null | null    |
+----------------------+

---------------------------------------------------------
while(Last.next != null)
---------------------------------------------------------

Traversal

Iteration 1

+----------------------+
| 5   | null | 10      |
+----------------------+
          ↕
+----------------------+
| 10  | 5    | null    |
+----------------------+
            ↑
           Last

---------------------------------------------------------
Last.next = node;
---------------------------------------------------------

+----------------------+
| 10  | 5    | 20      |
+----------------------+

---------------------------------------------------------
node.prev = Last;
---------------------------------------------------------

+----------------------+
| 20  | 10   | null    |
+----------------------+

---------------------------------------------------------
Last = node;
---------------------------------------------------------

+----------------------+
| 20  | 10   | null    |
+----------------------+
            ↑
           Last

FINAL

head
 ↓

+----------------------+
| 5   | null | 10      |
+----------------------+
          ↕
+----------------------+
| 10  | 5    | 20      |
+----------------------+
          ↕
+----------------------+
| 20  | 10   | null    |
+----------------------+

null <- [5] <-> [10] <-> [20] -> null

=========================================================
DISPLAY()
=========================================================

Node node = head;

node
 ↓

[5] <-> [10] <-> [20]

---------------------------------------------------------
Print 5
---------------------------------------------------------

node = node.next

[5] <-> [10] <-> [20]
         ↑
        node

---------------------------------------------------------
Print 10
---------------------------------------------------------

node = node.next

[5] <-> [10] <-> [20]
                 ↑
                node

---------------------------------------------------------
Print 20
---------------------------------------------------------

node = node.next

node = null

STOP

Output

5 -> 10 -> 20 -> END

=========================================================
DISPLAY REVERSE()
=========================================================

Forward Traversal

[5] <-> [10] <-> [20]
                 ↑
                last

---------------------------------------------------------
Print 20
---------------------------------------------------------

last = last.prev

[5] <-> [10]
         ↑
        last

---------------------------------------------------------
Print 10
---------------------------------------------------------

last = last.prev

[5]
 ↑
last

---------------------------------------------------------
Print 5
---------------------------------------------------------

last = null

STOP

Output

20 -> 10 -> 5 -> START

=========================================================
COMMON INTERVIEW MEMORY
=========================================================

INSERT FIRST

1. Create Node
2. node.next = head
3. head.prev = node
4. head = node

INSERT LAST

1. Create Node
2. Reach Last Node
3. Last.next = node
4. node.prev = Last

FORWARD

node = node.next

BACKWARD

node = node.prev

=========================================================
*/