package Inheritance;
public class Parents{
    void ParentProperties(){
        System.out.println("Parents have many properties");
    }
}
class child extends Parents{
    void childProperties(){
        System.out.println("child have there properties");
    }
    public static void main(String[] args) {
        Parents p = new Parents();
        p.ParentProperties();
        child c = new child();
        c.ParentProperties();
        c.childProperties();
        Parents p1 =new child();
        p1.ParentProperties();

        p1.childProperties();
//Reference = Parents
// Accessible:
// ✅ ParentProperties()
// ❌ childProperties()
    }
}