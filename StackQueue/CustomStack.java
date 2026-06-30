public class CustomStack{
    // we know that stack has Array inside , a Linkedlist with head node or more

    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr = -1;

    //initialize the stack's array-->constructer
    public CustomStack(){
        this(DEFAULT_SIZE);// cals another constructer in the same class
    }

    public CustomStack(int size) {
        this.data=new int[size];// -> refers to the 'data' variable of the current object
    }
//-----------------------------------
    public boolean push(int item){
        if(isFull()){
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
//------------------------------------
    public boolean isFull() {
        if(ptr==data.length-1){
             return true;
        }
        return false;
    }
    //-----------------------------------
    public boolean isEmpty(){
        return ptr==-1;
    }
    //----------------------------------
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot delete from empty stack");
            
        }
        int removedItem =data[ptr];
        ptr--;
        return  removedItem;
        // return data[ptr--];
        
    }
    //---------------------------------------
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot peek from empty stack");// this exception is created by myself 
            // called customed exception;
        }
        return ptr;
    }

    }
    
    

/*
protected int[] data;
--------------------
protected: Access modifier
- Accessible "inside the same class."
- Accessible "inside the same package."
- Accessible "by child classes (inheritance)."
- Used so classes like DynamicStack can directly use 'data'.

private static final int DEFAULT_SIZE = 10;
-------------------------------------------
private:"only in class"
- Can only be accessed inside CustomStack.

static:
- Belongs to the class, not individual objects.
- Only one copy exists for all CustomStack objects.

final:
- Value cannot be changed after initialization.
- Makes DEFAULT_SIZE a constant.

DEFAULT_SIZE:
- Default capacity of the stack.
- Written in UPPER_CASE by Java convention for constants.

Meaning of the whole line:
- Create a private class-level constant named DEFAULT_SIZE
  whose value is always 10.
*/




/*
STACK = LIFO (Last In First Out)

Operations:
1. push()  -> insert at top
2. pop()   -> remove from top
3. peek()  -> view top element
4. isEmpty()
5. isFull() (for fixed-size array stack)

Implementation Idea:

int[] data;   // storage
int ptr = -1; // points to top element

Empty Stack:
ptr = -1

Push:
ptr++;
data[ptr] = item;

Pop:
item = data[ptr];
ptr--;
return item;

Peek:
return data[ptr];
*/



/*
Initially

data = [ _, _, _, _, _ ]
ptr = -1


push(10)

data = [10, _, _, _, _ ]
ptr = 0


push(20)

data = [10, 20, _, _, _ ]
ptr = 1


push(30)

data = [10, 20, 30, _, _ ]
ptr = 2


pop()

returns 30

data = [10, 20, 30, _, _ ]
ptr = 1

(30 is logically removed because ptr moved back)
*/




/*
Constructors initialize the stack's storage.

CustomStack():
- Uses the default size (10).
- Calls CustomStack(int size) using this(DEFAULT_SIZE).

CustomStack(int size):
- Creates the actual array.
- data = new int[size];

Why needed?
- data is null by default.
- Constructor allocates memory for the stack.
- Allows creating stacks with default or custom sizes.

Examples:
new CustomStack();    // size = 10
new CustomStack(50);  // size = 50
*/