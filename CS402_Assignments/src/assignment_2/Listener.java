package assignment_2;

public class Listener implements Runnable {

	@Override
	public void run() {
		// Randomly print out messages at random intervals
		
		int i = 1;
		
		while (true) {
			System.out.println("Message number " + i + " from other user.");
			
			try {
				Thread.sleep((long) (Math.random() * 20000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			i++;
		}
		
	}

}