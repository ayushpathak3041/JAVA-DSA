public class Staticc {
    static int a =3 ;
    static int b;

    static{
        System.out.println("I am in static block");
        b=a*4;
    }

    public static void main(String[] args) {
        Staticc obj1 = new Staticc();
        System.out.println(obj1.a+" "+obj1.b);
        b=+3;
        Staticc obj2 = new Staticc();
        System.out.println(obj1.a+" "+obj1.b);
    }
}
