abstract class info {
    int age;

    abstract void career();// these methods need to be Overriden
    abstract void partner();
}// abstract class


class Son extends info{
    @Override
    void career(){
        System.out.println("I am going to be a coder") ;
    }
    @Override
    void partner (){
        System.out.println("I love Iron man");
    }
}
class Daughter extends info{
    @Override
    void career(){
        System.out.println("I am going to be a docter");
    }
    @Override
    void partner (){
        System.out.println("I love ");
    }
    public static void main(String[] args) {
        Son son = new Son();
        son.career();// in Son class
        Daughter daughter = new Daughter(); 
        daughter.career();// in zDaughter class
    }
}

