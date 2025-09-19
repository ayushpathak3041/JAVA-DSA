public class varargs {
    public static void main(String[] args) {
       
    multiple(2,3,"Ayush","Kunal","any number");
}
public static void fun(int...numbers){
    int sum =0;
    for(int n : numbers){
         sum=sum+n;
    }
    System.out.println(sum);
    
}

public static void multiple(int a, int b, String...v){

}
}
