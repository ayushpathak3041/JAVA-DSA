import java.util.Scanner;
public class functions {
    // Global Access
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
//  functon and method DRY formate --> don't repeat your self 
// Sum(); // aise hi printho jaega hume ise kerna nhi padega 
// int ans=Sum2();
// int a=sc.nextInt();
// int b=sc.nextInt();
// int sum=Sum3(a,b);
// System.out.println(sum);



//_________________________________________________________________-
    }
    //************************************************************ */
    /* Access_modifier|static|return_Type| name(arguments)| {
       //body
            return stetement;
    }    
            */
    public static void Sum() {
        System.out.println("Enter num1:");
        int num1=sc.nextInt();
        System.out.println("Enter num2:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Your sum is:"+sum);
    }        

    public static int Sum2(){ // return type is not void then you have to define parameter
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;
    }
    
    public static String greet(){
        String greeting="how you are";
        return greeting;
    }

    public static int Sum3(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }
}
