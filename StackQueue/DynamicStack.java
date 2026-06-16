public class DynamicStack extends CustomStack{// extend means inherit class
    public DynamicStack(){
        super();// it will call CustomStack (class)
    }
    public DynamicStack(int size){
        super();
    }
    // in Dynamic Stack problem is only Push 
    
  //  @Override
  public boolean push(int item){
    // this take care of being full
      if(this.isFull()){
        // then double the array size
        int [] temp= new int[data.length*2];
        // copy all the previous data in new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
      }
      // at this point we know that Arrya is not full
      // insert item
      return super.push(item);
  }

}


/*
DynamicStack kyu banaya?

CustomStack ki ek limitation hai:
Array full hone ke baad naye elements insert nahi kar sakte.

DynamicStack me jab stack full ho jata hai:

1. Naya array create karte hain (double size ka)
2. Purane elements copy karte hain
3. data ko naye array par point karwate hain
4. Naya element push kar dete hain

Example:

Old Array:
[10,20,30,40]

New Array:
[10,20,30,40,0,0,0,0]

Ab stack me aur elements add kar sakte hain.

extends CustomStack:
- Parent class ki sari functionality inherit kar leta hai.
- Hume push() ko modify karna hai, baki sab reuse kar sakte hain.

super.push(item):
- Parent class ka push() call karta hai.

DynamicStack = Auto Growing Stack
CustomStack  = Fixed Size Stack
*/




/*
==================== SUPER KEYWORD ====================

super = Parent Class (Immediate Parent) ko refer karta hai.

Current Hierarchy:

CustomStack
     ↑
     |
DynamicStack

Yaha DynamicStack child class hai
aur CustomStack parent class hai.

Isliye:

super
↓
CustomStack ko refer karega.

=======================================================

1. super() in Constructor

public DynamicStack(){
    super();
}

Meaning:

Jab DynamicStack object create hoga,

new DynamicStack()

to sabse pehle:

super()

call hoga.

Yaani:

CustomStack() constructor execute hoga.

Flow:

new DynamicStack()
        ↓
super()
        ↓
CustomStack()
        ↓
Array create hoga
        ↓
Control wapas DynamicStack me aayega

-------------------------------------------------------

Example:

public CustomStack(){
    this(DEFAULT_SIZE);
}

public DynamicStack(){
    super();
}

Execution:

new DynamicStack()
        ↓
DynamicStack()
        ↓
super()
        ↓
CustomStack()
        ↓
this(DEFAULT_SIZE)
        ↓
CustomStack(int size)
        ↓
data = new int[size]

Result:
Stack ki memory allocate ho gayi.

=======================================================

2. super(size)

public DynamicStack(int size){
    super(size);
}

Meaning:

Parent constructor ko custom size ke saath call karo.

Example:

new DynamicStack(20)

Execution:

DynamicStack(20)
        ↓
super(20)
        ↓
CustomStack(20)
        ↓
data = new int[20]

Result:
Size = 20 ka stack create hoga.

-------------------------------------------------------

Agar likho:

public DynamicStack(int size){
    super();
}

to problem:

new DynamicStack(20)

size = 20 ignore ho jayega.

Default size hi create hoga.

=======================================================

3. super.push(item)

return super.push(item);

Meaning:

Parent class ka push() call karo.

Yaha:

super.push(item)

↓

// CustomStack ka push()

public boolean push(int item){
    ptr++;
    data[ptr] = item;
    return true;
}

-------------------------------------------------------

DynamicStack me humne sirf array resize karne ka logic likha.

Actual insertion ka kaam:

super.push(item)

kar raha hai.

Flow:

push(50)
   ↓
Check Full?
   ↓
Resize Array (if needed)
   ↓
super.push(50)
   ↓
CustomStack push()
   ↓
Element insert

=======================================================

Quick Revision:

super()
    -> Parent constructor call karta hai

super(size)
    -> Parent constructor custom argument ke saath call karta hai

super.push(item)
    -> Parent class ka push() method call karta hai

super.data
    -> Parent ka data variable access kar sakte hain
       (agar accessible ho)

super = "Parent Class ki cheez use karo"

=======================================================
*/