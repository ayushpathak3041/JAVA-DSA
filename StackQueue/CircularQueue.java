public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int front=0,end=0;
//     front  -> remove kaha se hoga
//     end    -> insert kaha hoga
    int size = 0;// beacuse in circular queue end will come first index to show this is circular

    public CircularQueue(){
        this(DEFAULT_SIZE); // this sends size 
    }

    public CircularQueue(int defaultsize) {// this creates array with that size
        this.data=new int[defaultsize];
                                          }
public boolean isFull(){
    if(size==data.length){
        return true;
    }
    return false;
}
public boolean isEmpty(){
    if(size==0){
        return true;
    }
    return false;
}

public boolean insert(int item){
    if(isFull()){
        return false;
    }
    
    data[end]=item; // fir item ko array me store kerunga 
    end++;// pointer ko aage bhej dunga 
    end=end%data.length;
    size++;
    return true;
}
public int remove() throws Exception{
    if(isEmpty()){
        throw new Exception("Queue is Empty");
    }
    int removed = data[front];// isme 2 pointer hai na isliye 
    front++;
    front=front%data.length;// ye cicular queue ke liye hai
    size--;
    return removed;
}
public int Front() throws Exception{
    if(isEmpty()){
        throw new Exception("We cann't calculate front in empty queue");
    }
    return data[front];
}
public void Display() throws Exception{
    if(isEmpty()){
        throw  new Exception("Empty Queue");
    }
    int i=front;
    do { 
        System.out.print(data[i]+"->");
        i=(i+1)%data.length;
        
    } while (i!=end);
    System.out.print("END");
}

}
// front always points to the first valid element of queue.
// After removing an element, front moves ahead.
// front % data.length is used to make queue circular.