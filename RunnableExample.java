
package ThreadPack;

public class RunnableExample {
    public static void main(String[] args) throws Exception {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.setName("ChildThreaad");
        t.start();
        for (int i = 0; i < 10; i++) {
                System.out.println("Mainclass:ThreadPack.MyRunnable.run() :"+i);
                Thread.sleep(10);
            }
    }
}
class MyRunnable implements Runnable{
    Thread t;
    public void run(){
        
        try {
            t=Thread.currentThread();
            for (int i = 0; i < 10; i++) {
                System.out.println("Childclass:ThreadPack.MyRunnable.run() :"+t.getName()+" "+i);
                Thread.sleep(10);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}