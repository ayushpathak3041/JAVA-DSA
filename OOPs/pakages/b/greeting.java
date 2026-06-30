package pakages.b;
import pakages.a.Messege;
public class greeting {
    //static 
     static String college="BBD";
    public static void main(String[] args) {
        //accesing file from another package
        Messege m = new Messege();
        m.messege();
        // changing static varible using class 
        greeting.college="IIt";
    }
    
}
