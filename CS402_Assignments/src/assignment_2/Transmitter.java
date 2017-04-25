package assignment_2;

import java.util.Scanner;

public class Transmitter implements Runnable {

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Send next message:");

			scanner.nextLine();
		}
	}

}