
package ThreadPack;

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        Box b=new Box();
        ProducerThread pt=new ProducerThread(b);
        ConsumerThread ct=new ConsumerThread(b);
        pt.start();
        ct.start();
    }
}
class Box{
    int item;
    boolean isEmpty=true;
    
   synchronized public void put(int item) throws Exception{
        if(!isEmpty){
            wait();
        }
        this.item=item;
        System.out.println("Put In Box :"+this.item);
        isEmpty=false;
        notifyAll();
    }
    synchronized public void get() throws Exception{
        if(isEmpty){
            wait();
        }
        System.out.println("Get In Box :"+this.item);
        isEmpty=true;
        notifyAll();
    }
}
class ProducerThread extends Thread{
    Box b;
    public ProducerThread(Box b){
        this.b=b;
    }

   
    public void run() {
        int i=1;
        try{
        while(true){
        b.put(i++);
        }}catch(Exception e){
                e.printStackTrace();
                }
    }
}
  
class ConsumerThread extends Thread{
     Box b;
    public ConsumerThread(Box b){
        this.b=b;
    }
    

    public void run() {
        int i=1;
        try{
        while(true){
        b.get();
        }
        }catch(Exception e){
          e.printStackTrace();
        }
    }
}
    
    
