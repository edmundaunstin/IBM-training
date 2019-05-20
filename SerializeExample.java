
package ThreadPack;

public class SerializeExample {
    public static void main(String[] args) {
        SharedObject so=new SharedObject();
        CallingThreads ct1=new CallingThreads(so,"MESSAGE FROM CHILD 1...");
        CallingThreads ct2=new CallingThreads(so,"MESSAGE FROM CHILD 2...");
        ct1.start();
        ct2.start();
        so.sendMessage("HELLO.....");
        so.sendMessage("IBM.....");
    }
}
class SharedObject{   //common method that is shared
   synchronized public void sendMessage(String message){
        System.out.print("[");
        System.out.print(message);
        System.out.println("]");
    }
            
    
}
class CallingThreads extends Thread{
    SharedObject so;
    String message;
    public CallingThreads(SharedObject so,String message) {
        this.so=so;
        this.message=message;
    }
    public void run (){
        try{
            System.out.println(message);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}