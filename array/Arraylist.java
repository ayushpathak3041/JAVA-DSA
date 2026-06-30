import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList of Integer type with initial capacity of 10
        ArrayList<Integer> list = new ArrayList<>(10);

        /* 
         * 🔹 Taking input from user
         * loop runs 5 times, each time user enters an integer
         * that integer gets added to 'list'
         */
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt()); // add() → appends value at end
        }
        /*
         * 🔹 Printing elements
         * get(index) → returns element at given index
         */
        System.out.println("\nYou entered:");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        /*
         * Other common ArrayList methods (examples):
         *
         * list.set(index, value) → replace value at index
         * list.contains(value)   → returns true if value is present
         * list.remove(index)     → removes element at index
         * list.size()            → returns number of elements
         * list.clear()           → removes all elements
         */
    }
}
/*class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> List=new Arraylist<>();
        for(int i=0; i<nums.length && i<index.length;i++){
            List.add(index(i),nums(i));🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯🎯
            // (int index , E element);
            // means here first will be index and second  will be actual value 
        }
        int[] target = new int[List.size];
        for(int i=0;i<target.length;i++){
            target(i)=List.get(i);
        }
        return target;
    } */
