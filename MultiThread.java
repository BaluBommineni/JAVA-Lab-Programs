public class MultiThread extends Thread{
	public void run(){
		System.out.println("Hello");
	try {
		MultiThread.sleep(500);
		}
	catch(InterruptedException IE) {}
	System.out.println("Hi");
    }
public static void main(String[] args) throws InterruptedException {
	MultiThread T1 = new MultiThread();
	MultiThread T2 = new MultiThread();
	T1.start(); 
	T1.join();
	T2.start();
	T2.join();
	}
}	
