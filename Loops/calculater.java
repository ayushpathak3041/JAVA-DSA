import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ans=0;
        while (true) { 
            System.out.println("Enter an operater to perform operation");
            char op=sc.next().trim().charAt(0);
            if(op =='x' || op=='X'){
                System.out.println("Enter correct operater: \nyou pressed: x or X");
                break;
            }
            if(op =='+' || op=='-' || op=='*' || op=='/' || op=='%'){
            System.out.println("Enter num1:");
            int num1=sc.nextInt();
            System.out.println("enter num2");
            int num2=sc.nextInt();
            if(op=='+'){
                ans=num1+num2;
            }
            if(op=='-'){
                ans=num1-num2;
            }
            if(op=='*'){
                ans=num1*num2;
            }
            if(op=='/'){
                if(num2!=0){
                    ans=num1/num2;
                } 
            }
            if(op=='%'){
                ans=num1%num2;
            }else{
                System.out.println("Invalid operation!!");
            }
             System.out.println(ans);
            }
        }
    }
    }
    

