public class ThreadExample{
	public static void main(String args[]) throws Exception{
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.setName("ChildThread1");
		t2.setName("ChildThread2");
		t1.start();
		t2.start();
                System.out.println("t1.isAlive :"+t1.isAlive());
                System.out.println("t2.isAlive :"+t2.isAlive());
		for (int i=1;i<=10 ;i++ ) {
			Thread.sleep(10);
			System.out.println("Main Thread :"+ i);
		}
                t1.join();
                t2.join();
                System.out.println("t1.isAlive :"+t1.isAlive());
                System.out.println("t2.isAlive :"+t2.isAlive());
	}
}
class MyThread extends Thread{
	public void run(){
		System.out.println("Start a Thread");
		try{
			for (int i=1;i<=10 ;i++ ) {
				Thread.sleep(100);
				System.out.println("Child Thread :"+getName()+":"+ i);
			}
		}catch(Exception e){
		e.printStackTrace();
		}
		System.out.println("End a Thread");
	}
}