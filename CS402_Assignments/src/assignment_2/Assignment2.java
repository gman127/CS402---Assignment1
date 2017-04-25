package assignment_2;

public class Assignment2 {

	public static void main(String[] args) {

		(new Thread(new Listener())).start();
		
		(new Thread(new Transmitter())).start();
	}
}