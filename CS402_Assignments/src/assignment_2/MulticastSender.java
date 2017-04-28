package assignment_2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MulticastSender implements Runnable{

	public void run() {

		DatagramSocket socket = null;
		DatagramPacket outPacket = null;
		byte[] outBuf;
		final int PORT = 8888;

		try {
			socket = new DatagramSocket();
			String msg;

			while (true) {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter message to send:");
				msg = scanner.nextLine();

				outBuf = msg.getBytes();

				//Send to multicast IP address and port
				InetAddress address = InetAddress.getByName("224.2.2.3");
				outPacket = new DatagramPacket(outBuf, outBuf.length, address, PORT);

				socket.send(outPacket);

				System.out.println("Server sends : " + msg);
			}
		} 
		catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}