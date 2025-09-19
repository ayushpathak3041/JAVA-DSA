
import java.util.Scanner;

public class loopif {
    public static void main(String[] args) {
        if(true){
            System.out.println("There is no GOD");
        } 
        int count=1;
        while(count!=5){   // you dont know how many times loops is going to run use while loop
            System.out.println(count);
            count++;

        }
        // also similar like while loops and for loop 
        for(int count1=1;count1!=5;count1++){ //when you  know how many times loops is going to run
            System.out.println(count);
        }

        ////            new 
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the temp in c☺☺♦♥♦♣•◘○♣♥");
        float tempC=sc.nextFloat();
        float tempF = (tempC*9/5)+32;
        System.out.println("Your temp in F:"+ tempF);
        
    }
	
}
