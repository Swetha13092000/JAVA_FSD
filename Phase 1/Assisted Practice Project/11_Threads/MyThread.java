package createThread;

public class MyThread extends Thread {

	public void run()
 	{  		
		System.out.println("concurrent thread started running..");	
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new  MyThread();
  		mt.start();

	}

}
