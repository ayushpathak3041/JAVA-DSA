class Parent{
 int maxSpeed = 12;
    Parent(){
        System.out.println("Parent constructer called");
    }
 void messege(){
    System.out.println("Parent method");
 }
}
class child extends Parent{
    int maxSpeed=43;
       child(){
        super();/// Parent constructer called
        System.out.println("child constructer called");
       }
    void messege(){
        System.out.println("max speed of parent is : "+super.maxSpeed);// Accesing Parent class variable 
        System.out.println("Max Speed of child is :"+maxSpeed);
    }
    void display(){
        messege();
        super.messege();// Accessiing parent Method
    }

}
public class superr{
    public static void main(String[] args) {
        child c = new child();
        c.messege();
        c.display();
        Parent p = new Parent();
        p.messege();
    }
}