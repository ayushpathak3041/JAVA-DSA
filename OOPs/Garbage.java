public class Garbage {
    final int age =23;
    String name;

    public Garbage(String name) {
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("object is destroyed");
    }
    
    public static void main(String[] args) {
        Garbage obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new Garbage("Random name");
        }
        ////////////  here you are creating reference man
    }
}

/*
Every time:

obj = new Garbage(...);

1. A new object is created in Heap.
2. 'obj' starts pointing to the NEW object.
3. The OLD object loses its only reference.
4. The OLD object becomes eligible for Garbage Collection.
5. JVM may delete it later (not immediately).
*/
