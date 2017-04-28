package assignment_2;

public class Assignment2 {

	public static void main(String[] args) {

		(new Thread(new MulticastReceiver())).start();
		
		(new Thread(new MulticastSender())).start();
	}
}