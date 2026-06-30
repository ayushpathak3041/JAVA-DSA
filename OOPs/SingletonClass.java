/**
 * SingletonClass - ek simple Singleton ka implementation
 *
 * Program flow (flow):
 * 1) Class load hoti hai, static field 'instance' null se initialize hoti hai.(   public class SingletonClass {-------->  private static SingletonClass instance; )
 * 2) Kisi bhi code se Singleton chahiye to getInstance() call karte hain.
 * 3) getInstance() check karta hai agar instance null hai to naya object banata hai, warna existing object return karta hai.
 * 4) Is tarah se program me sirf ek hi instance banta hai aur sab jagah wahi share hota hai.
 *
 * Ye comments file me line-by-line batate hain ki har line kya kar rahi hai.
 */
public class SingletonClass {
    // Private constructor: isse ye ensure hota hai ki class ka object
    // class ke bahar se directly nahi banega (no 'new SingletonClass()' allowed).
    private SingletonClass(){
        // Constructor body empty: initialization agar chahiye to yahan karein.
    }

    // Single (static) reference jo single instance ko hold karega.
    // Initially null hota hai jab class load hoti hai.
    private static SingletonClass instance;

    // Public static method jise callers use karenge instance pane ke liye.
    public static SingletonClass getInstance(){
        // Agar abhi tak instance create nahi hua (null hai) to naya banayenge.
        if(instance==null){
            // Naya object create kar rahe hain aur 'instance' me assign kar rahe hain.
            instance=new SingletonClass(); 
        }
        // Agar instance already exist karta hai to wahi return hoga.
        return instance;
    }

    /*
     * Why use Singleton class (kyun use karte hain):
     * - Ek global point of access provide karta hai (centralized instance).
     * - Resource control: jab koi expensive resource (connection, config manager, thread pool)
     *   single shared object ke through manage karna ho.
     * - Consistency: application ke sab parts same state/view share karte hain.
     *
     * Note: Is simple implementation me thread-safety nahi di gayi. Multithreaded environment
     * me double-checked locking, synchronized method, eager initialization, ya enum-based
     * singleton use karna chahiye.
     */
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();// because getInstance is statkc so call with class
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();
        // these objects pointing to only one object becuase instance creates only one 

    }
}
