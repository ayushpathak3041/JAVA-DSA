public class StackMain {//Filo
    public static void main(String[] args)  throws  Exception {// because in this method pop method throws exception
        CustomStack stack = new CustomStack(10);// initial size is 5;
        // fixed size🎯
             stack.push(8);
             stack.push(58);
             stack.push(9);
             stack.push(3);
             stack.push(23);
             stack.push(54);



             System.out.println(stack.pop());// this gives problem because it throws exception so youa have to throw exception in main method
             System.out.println(stack.pop());
             System.out.println(stack.pop());
             System.out.println(stack.pop());
             System.out.println(stack.pop());
            //  System.out.println(stack.pop());// this line gives excepttin because size is only 5




            DynamicStack Dstack = new DynamicStack();
            // mtlb ki fixed size nhi hai 🎯
    }
}
