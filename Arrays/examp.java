class Student {
    String name;
    Student(String name) { this.name = name; }
}

public class examp {
    public static void main(String[] args) {
        Student[] arr = new Student[3]; // Array object in heap (continuous refs)

        arr[0] = new Student("Ayush"); // Object stored somewhere in heap
        arr[1] = new Student("Rohan"); // Stored at a different place in heap
        arr[2] = new Student("Neha");  // Again, somewhere else
    }
}
