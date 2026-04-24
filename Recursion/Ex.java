public class Ex {
    public static void Print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // if you are calling a function again and again , it will take space in Stack memory.
        Print(n+1);
    }
    public static void main(String[] args) {
        Print(1);
    }
}
 