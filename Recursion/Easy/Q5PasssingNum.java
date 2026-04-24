public class Q5PasssingNum {
    public static void main(String[] args) {
        Passing(10);
    }
    static void Passing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Passing(--n);
    }
    
}
