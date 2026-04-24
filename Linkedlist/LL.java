// Package declaration - linked list ko organize karne ke liye
package Linkedlist;
// LL class ka definition - yeh linked list ko represent karti hai
public class LL {              

    // head variable - linked list ka pehla node, jahan se start hota hai
    private Node head;
    // size variable - kitne nodes hain iska count rakhta hai
    private int size;

    // Constructor - jab naya LL object banate hain tab ye chalti hai
    public LL() {
        // size ko 0 se initialize karte hain kyunki abhi koi node nahi hai
        size = 0;
        // head null rehta hai kyunki list empty hai
    }

    // 🔹 Node class - linked list ka ek building block, har node yahan se banata hai
    private class Node {
        // value - node mein actual data store hota hai
        int value;
        // next - agle node ka reference, isse chain banti hai
        Node next;                 // ------------------------------------→ Node ka address (reference) store karta hai
        // Node ka constructor - jab naya node banate hain
        Node(int value) {
            // this.value = value - is node ko value de rahe hain
            this.value = value;
            // next automatically null hota hai naye node mein
        }
    }

    // 🔹 insertFirst method - list ke shuru mein element daalna
    public void insertFirst(int value) {
        // Naya node banate hain jisme value daalte hain
        Node node = new Node(value);
        // Naye node ke next mein puraana head dal dete hain (link banani padti hai)
        node.next = head;
        // Ab head ko naye node par point karte hain (naya node pehla ho gaya)
        head = node;
        // Size ko 1 se badhate hain kyunki ek node add ho gaya
        size++;
    }

    // 🔹 display method - saare nodes ko print karne ke liye
    public void display() {
        // temp variable mein head ka reference dal dete hain (touring ke liye)
        Node temp = head;

        // While loop - jab tak null na aaye tab tak chalega
        while (temp != null) {
            // temp.value ko print karte hain phir "-> " likha hai
            System.out.print(temp.value + " -> ");
            // temp ko next node par move karte hain
            temp = temp.next;
        }

        // Last mein "null" likha hai taki pata chale list khatam ho gaya
        System.out.println("null");
    }

    // 🔹 main method - program yahaan se shuru hota hai
    public static void main(String[] args) {
        // Naya LL object banate hain (empty linked list)
        LL list = new LL();

        // 10 ko list ke shuru mein daalta hain (list: 10 -> null)
        list.insertFirst(10);
        // 20 ko list ke shuru mein daalta hain (list: 20 -> 10 -> null)
        list.insertFirst(20);
        // 30 ko list ke shuru mein daalta hain (list: 30 -> 20 -> 10 -> null)
        list.insertFirst(30);

        // List ko display karte hain (output: 30 -> 20 -> 10 -> null)
        list.display();
    }
}

/*
╔════════════════════════════════════════════════════════════════════════════╗
║              LINKED LIST - PURI TARAH SE SAMJHNE KE LIYE (THEORY)          ║
╚════════════════════════════════════════════════════════════════════════════╝

📌 LINKED LIST KYA HOTI HAI:
→ Linked list ek data structure hai jisme elements chain mein connected hote hain
→ Har element (node) apne baad wale element ka address rakhta hai
→ Array ke bilkul opposite hota hai - array mein sab ek line mein hote hain, 
  linked list mein har node apna next node specify karti hai

📌 STEP BY STEP YEH PROGRAM KYA KAR RAHA HAI:

1️⃣  CLASS BANANA (LL CLASS):
   → Pehle LL class banai jisme linked list ke sare operations hone wale hain
   → Is class mein do variables hain:
     • head: yeh list ka pehla node hai (starting point)
     • size: kitne nodes hain ye count rakhe

2️⃣  CONSTRUCTOR BANANA (LL Constructor):
   → Jab "LL list = new LL();" likha, tab constructor chalti hai
   → Constructor mein size = 0 likha hai (shuru mein koi node nahi)
   → head automatic null hota hai (naya list empty hota hai)

3️⃣  NODE CLASS BANANA (Node Inner Class):
   → Node ek building block hai linked list ka
   → Har node ke andar:
     • value: actual data (10, 20, 30 jo data daalna hai)
     • next: agle node ka reference/address
   → Node constructor mein value set karte hain

4️⃣  INSERTFIRST METHOD (Pehle jo element daalna hai):
   → Jab insertFirst(10) likha, tab ye method chalti hai
   
   STEP A: "Node node = new Node(10)" 
           → Naya node banata hai jisme value 10 hoti hai
           → node.next abhi null hota hai (abhi agle node nahi hai)
   
   STEP B: "node.next = head"
           → Naye node ke next mein current head dal dete hain
           → Agar pehli bar hai to head null hoga, to next bhi null
           → Agar pahle se nodes hain to unhe chain mein connect kar dete hain
   
   STEP C: "head = node"
           → Ab head ko naye node par point karte hain
           → Naya node list ka pehla node ban gaya
   
   STEP D: "size++"
           → Size ko 1 se badhate hain

5️⃣  EXECUTION KA ORDER (program mein kya order hai):

   CALL 1: insertFirst(10)
   ─────────────────────
   • Naya node banata hai value = 10, next = null
   • node.next = head (jo null hai)
   • head = node (pehla node ab 10 hai)
   • size = 1
   • List: 10 -> null
   
   CALL 2: insertFirst(20)
   ─────────────────────
   • Naya node banata hai value = 20, next = null
   • node.next = head (jo ab 10 wala node hai)
   • head = node (pehla node ab 20 hai)
   • size = 2
   • List: 20 -> 10 -> null
   
   CALL 3: insertFirst(30)
   ─────────────────────
   • Naya node banata hai value = 30, next = null
   • node.next = head (jo ab 20 wala node hai)
   • head = node (pehla node ab 30 hai)
   • size = 3
   • List: 30 -> 20 -> 10 -> null

6️⃣  DISPLAY METHOD (list ko print karna):
   → Jab display() likha, tab ye method chalti hai
   
   STEP A: "Node temp = head"
           → Ek temporary pointer banate hain jo head par point kare (30 par)
   
   STEP B: While loop "while(temp != null)"
           → Loop tab tak chalti hai jab tak null na ho
           
   ITERATION 1: temp = 30 wala node
                → Print: "30 -> "
                → temp = temp.next (ab 20 par hai)
   
   ITERATION 2: temp = 20 wala node
                → Print: "20 -> "
                → temp = temp.next (ab 10 par hai)
   
   ITERATION 3: temp = 10 wala node
                → Print: "10 -> "
                → temp = temp.next (ab null hai)
   
   ITERATION 4: temp = null
                → Loop exit (while condition false)
   
   STEP C: "System.out.println("null")"
           → "null" print karte hain
   
   FINAL OUTPUT: 30 -> 20 -> 10 -> null

📌 VISUAL REPRESENTATION:

Shuru mein (empty list):
head → null

insertFirst(10) ke baad:
head → [10|null]

insertFirst(20) ke baad:
head → [20|→] → [10|null]

insertFirst(30) ke baad:
head → [30|→] → [20|→] → [10|null]
       ↑      ↑      ↑      ↑
      node  next  next    next
             (20) (10)    (null)

📌 LINKED LIST KE FAYDE:
✓ Insert/Delete operation O(1) time mein (agar position pata ho)
✓ Dynamic size - memory mein utna hi leti hai jitne elements hain
✓ No waste of memory like arrays

📌 LINKED LIST KE NUKSAN:
✗ Random access nahi - kisi bhi node ko directly access nahi kar sakte
✗ Har node mein extra memory (next pointer) lagta hai
✗ Traversal slow hota hai (start se end tak Jana padta hai)

╚════════════════════════════════════════════════════════════════════════════╝
*/