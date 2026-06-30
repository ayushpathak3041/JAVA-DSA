public class ObjectClass{
    int num;
    // we will go in detaled 
     @Override
     public int hashCode(){
        return super.hashCode();
     }
     @Override
     public boolean equals(Object obj){
        return super.equals(obj);
     }
     @Override
     public String toString(){
        return super.toString();
        //ClassName@ Hexadecimal HashCode        provides
     }
     @Override
     public void finalize() throws Throwable{
        super.finalize();
     }
     public ObjectClass(int num){
        this.num=num;
     }
     @Override
     protected Object clone() throws CloneNotSupportedException{
        return super.clone();
     }
     public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(34);
        System.out.println(obj.hashCode());
     }
}
/*
IMPORTANT INTERVIEW POINTS

✔ Every class in Java extends Object.
✔ Object is the superclass of all classes.
✔ Object provides common methods to every object.
✔ If no parent class is specified,
  Java automatically extends Object.
✔ Object enables polymorphism because
  every object can be treated as an Object.
✔ Object class is present in java.lang package.
object class provides methods 
toString()
equals()
hashCode()
getClass()
clone()
wait()
notify()
notifyAll()
finalize() (deprecated)
*/