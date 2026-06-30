public class Constructer{
    String name;
    int rollno;
    float marks;

    Constructer(){
        // this.name = "kunal";
        // this.rollno=23;
        // this.marks=43.5f;
// this is how you can call anothe constructer 
         this("ajay",14,43.4f);        
    }

    public Constructer(String name, int rollno, float marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    Constructer( Constructer other){// taking obj of class 
        this.name=other.name; // current obj name  = jo pass kiya gya hai hai
        this.marks=other.marks;
        this.rollno=other.rollno;
    }

    public static void main(String[] args) {
        Constructer cs = new Constructer();
        System.out.println(cs.name);
        System.out.println(cs.marks);
        System.out.println(cs.rollno);
        Constructer cs1 = new Constructer("Anubhav",19,54.5f);
        System.out.println(cs1.name);
         System.out.println(cs1.marks);
          System.out.println(cs1.rollno);
        Constructer random = new Constructer(cs1);// iske parameter  me obj daalana hai koi
        System.out.println(random.name);// in this we are passing obj as a refrence
        System.out.println(random.marks);
        System.out.println(random.rollno);    
        
        Constructer one = new Constructer();
        Constructer two = one;
        one.name="something somethig";
        System.out.println(two.name);///// pointing to same obj in heap
    }
}