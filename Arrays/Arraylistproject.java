import java.util.*;
public class Arraylistproject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks=new ArrayList<>();

        while (true) {
            System.out.println("\n===== Student Marks Manager =====");
            System.out.println("1. Add marks");
            System.out.println("2. Display marks");
            System.out.println("3. Update marks");
            System.out.println("4. Remove marks");
            System.out.println("5. Search marks");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1->{System.out.print("Enter marks to add:");
                           marks.add(sc.nextInt());
                        System.out.println("Your marks added:🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯");}

                case 2->System.out.println("Your marks: "+marks);
                case 3->{System.out.print("Enter index:");
                           int index = sc.nextInt();
                           if (index>=0 && index<marks.size()) {
                            System.out.print("Enter value: ");
                             int value=sc.nextInt();
                             marks.set(index, value);
                           System.out.print("Your marks are updated 🤘🤘🤘🤘🤘🤘🤘🤘🤘🤘🤘🤘");
                           }
                           else{
                            System.out.println("Invalid index!!");
                           }
                             
                          }
                case 4-> {System.out.print("Enter index:");
                            int index=sc.nextInt();
                            if(index>=0 && index<marks.size()){
                                marks.remove(index);
                                System.out.println("index no. "+index+" is deleted from list");
                            }
                           }  
                case 5-> {System.out.print("Entre makrs to search:");
                            int searchmarks=sc.nextInt();
                            if(marks.contains(searchmarks)){
                                System.out.print("Your marks "+searchmarks+" is available in list");
                            }
                        else{
                            System.out.print("Your marks "+searchmarks+" is not in list");
                        }}  
                          case 6->System.out.print("Exiting program...........");
                          default-> System.out.print("Enter valid choice:");                 
            }   
        }
    }
}