public class CustomQueue {
    // array ko initialize kerdo
    // fixed size varibale default 
    // pointer ko initialize kero 0 se

    private final int[] data;
    private static final int  DEFAULT_SIZE=10;
    int end =0;
  
    // create constructers
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){// creating an Array
        this.data=new int[size];
    }
    // pele Array bnate hai jime value null rehti hh
    // then insert kerate hh
    //--------------------------
    public boolean  insert(int item){
        if(isFull()){
             return false;
        }
        data[end]=item;
        end++;
        return true;
    }
    //_________________________________________________________-____________
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("There is no emliment in Queue");
        }
        int removedItem=data[0];
        // now we have to shift items in arayya with index=-1;

        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removedItem;
    }
    //_________________________________________________________
    private boolean isFull() {
         if(end==data.length){
            return true;
         }
         return false;
    }

    private boolean isEmpty() {
        return end==0;
    }
    //__________________________________________________________
    public int Front() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return data[0];
    }
}
