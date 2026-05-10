// ========== STUDENT CLASS ==========
// A simple class representing a Student entity
class Student {
    // Instance variable: stores the student's name (allocated separately for each object)
    String name;
    
    // Constructor: initializes a new Student object with a given name
    // 'this.name' refers to the instance variable, parameter 'name' is what's passed in
    Student(String name) { 
        this.name = name; // Assigns the passed name parameter to the instance variable
    }
}

// ========== MAIN CLASS & ENTRY POINT ==========
public class examp {
    // Main method: entry point of the Java program
    public static void main(String[] args) {
        // STEP 1: Create an array of Student references (not actual objects yet)
        // new Student[3] allocates memory for an array that can hold 3 references
        // All references are initialized to 'null' (empty slots)
        Student[] arr = new Student[3];

        // STEP 2: Create actual Student objects and link them to array indices
        // Each 'new Student()' creates a separate object in heap memory
        // The array stores REFERENCES (memory addresses) to these objects, not the objects themselves
        
        // Create first Student object "Ayush" and store its reference at index 0
        arr[0] = new Student("Ayush");
        // Create second Student object "Rohan" and store its reference at index 1
        arr[1] = new Student("Rohan");
        // Create third Student object "Neha" and store its reference at index 2
        arr[2] = new Student("Neha");
        
        // NOTE: All three Student objects exist at DIFFERENT locations in heap memory
        // The array just keeps track of WHERE each object is (their references)
    }
}
