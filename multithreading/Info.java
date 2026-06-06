//               1🎯
class Info extends Thread {
//     extends Thread
// Tum ek naya thread bana rahe ho. 
    public void run() {//Ye method define karta hai ki thread kya kaam karega.
//         run()
// normal method call
// new thread create nahi hota
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Info t1 = new Info();
        t1.start();   // thread start  Ye actual new thread create karta hai.
//         start()
// JVM new thread banata hai
// internally run() call hota hai
    }
}

//-------------------------------------------------------------------------------------

//                     2🎯

class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
// Ye Better Kyu Hai?
// Because Java multiple inheritance support nahi karta.
// Agar tum already kisi class ko extend kar rahe ho:
//--------------------------------------------------------------------------------------------

//                    Basic Lambda Thread Example

public class Demo {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Thread is running...");
        };
        Thread t1 = new Thread(r);
        t1.start();
    }
}//Lambda Expression-->() -> {
// Ye short form hai:
// new Runnable() {
//     public void run() {
//         System.out.println("Thread is running...");
//     }
// }


//---------------------------------------------------
public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 : " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 : " + i);
            }
        });
        t1.start();
        t2.start();
    }
}

//                  Thread Sleep Example

public class Demo {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for(int i = 1; i <= 5; i++) {

                System.out.println(i);

                try {
                    Thread.sleep(1000);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
            }
        });

        t1.start();
    }
}