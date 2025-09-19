  public class Typecasting01 {
    public static void main(String[] args) {
        byte b =42;
        char c='a';
        short s= 1024;
        int i=50000;
        float f =324.f;
        double d= 0.1234;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+"  "+(i/c)+"  "+(d-s));
        // IN NOTES I HAVE WRITTEN  float + int - double = double (ans in double )
        System.out.println(result);
        
    }
    
}
