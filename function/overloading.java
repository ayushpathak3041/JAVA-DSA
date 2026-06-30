
import java.util.Arrays;

public class overloading {
    // same name          diff parameter
    public static void main(String[] args) {
        // fun(43);
        // fun("Kunal");
        demo(23,33,32);
        demo("Abhilah","ayush");
        
    }
   public static void fun(int a){
    System.out.println(a);

    }
    public static void fun(String name){
        System.out.println(name);
    }

    public static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    public static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
}
