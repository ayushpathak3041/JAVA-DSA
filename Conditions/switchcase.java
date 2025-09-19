
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit = sc.nextLine();
// 
        // if(fruit.equals("mango")){
        //     System.out.println("King of fruits:");
        // }
        // if(fruit.equals("apple")){
        //     System.out.println("a sweet red fruit");
        // Add a separator with emoji
       
// System.out.println("🍎-----------------------------🍌");
        // switch (fruit) {
        //     case "Mango":
        //     System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //     System.out.println("A sweet red fruit");
        //     break;
        //     case "Banana":
        //     System.out.println("Banana is yellow fruit");
        //     break;
        //     case "Grapes":
        //     System.out.println("Bunch of Grapes");    
        //     break;
        //     default:
        //         System.out.println("Invalid input!!");
        // ----------------------------------------
//
        // Enhanced switch (Java 14+)
        // switch (fruit) {
        //     case "Mango"   -> System.out.println("King of fruits");
        //     case "Apple"   -> System.out.println("A sweet red fruit");
        //     case "Banana"  -> System.out.println("Banana is yellow fruit");
        //     case "Grapes"  -> System.out.println("Bunch of Grapes");
        //     default        -> System.out.println("Invalid input!!");
        // }

        // Enhanced switch for numbers: 1-7 for Mango, 8-10 for Apple
        // int num = sc.nextInt();
        // switch (num) {
        //     case 1, 2, 3, 4, 5, 6, 7 -> System.out.println("Mango selected");
        //     case 8, 9, 10            -> System.out.println("Apple selected");
        //     default                  -> System.out.println("Invalid number!");
        // } 

    
        System.out.println("Enter you empID");
        int empID=sc.nextInt();
        switch (empID) {
            case 1 : System.out.println("Your empID is 1");
            break;
            case 2: System.out.println("Your empID is 2\nHi empID 2 Ayush Pathak");
            break;
            case 3:
                System.out.println(" EmpID 3 (special Access):");
                String dep = sc.next();
                dep = dep.toLowerCase();
                switch (dep) {
                    case "IT": 
                        System.out.println("Your department is IT so you are software developer in this company:");
                        break;
                    case "Management":
                        System.out.println(" ooh! sorry sorry You are from Management Good for company");
                        break;
                    case "Sales":
                        System.out.println("Sorry buddy You are from Sales deparment thats why my company is growning !!!!!");
                        break;
                    default:
                        System.out.println("You can't Access this because your department dont allow this:Access Denied");
                }
                break;
            default :
                System.out.println("Unauthorise Access: 🤘");   
        }

        // Enhanced switch (Java 14+)
        switch (empID) {
            case 1 -> System.out.println("[Enhanced] Your empID is 1");
            case 2 -> System.out.println("[Enhanced] Your empID is 2\nHi empID 2 Ayush Pathak");
            case 3 -> {
                System.out.println("[Enhanced] EmpID 3 (special Access):");
                String dep = sc.next();
                dep = dep.toLowerCase();
                switch (dep) {
                    case "it" -> System.out.println("[Enhanced] Your department is IT so you are software developer in this company:");
                    case "management" -> System.out.println("[Enhanced] ooh! sorry sorry You are from Management Good for company");
                    case "sales" -> System.out.println("[Enhanced] Sorry buddy You are from Sales deparment thats why my company is growning !!!!!");
                    default -> System.out.println("[Enhanced] You can't Access this because your department dont allow this:Access Denied");
                }
            }
            default -> System.out.println("[Enhanced] Unauthorise Access: 🤘");
        }

                
               



        }
    }
    
