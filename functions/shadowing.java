


public class shadowing {
    static int x=90;  //(instance variable) now it is global-->everybody can access it from anywhere 
    public static void main(String[] args) {
        System.out.println(x);
        int x;// we can also initialize x in inner block ( here you declare x)
        x=40; // x is overrides on higher level scope x(here you initialised x) if you wanna print then you will print after initialization
        System.out.println(x);// scope will begin when value is initialised
        fun();
        // if now you wanna access again global variable x from class shadowing you have to use this.x keyword for it 
        System.out.println(shadowing.x);//So, shadowing.x is used to specifically access the instance variable.🔹 How to access static/global x in static context?
          //Use the class name: Shadowing.x.
    }
    static void fun(){
        System.out.println(x);
    }
}