package assignment_2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Transmitter implements Runnable {

	@Override
	public void run() {
		DatagramSocket socket = null;
		DatagramPacket outPacket = null;
		byte[] outBuf;
		final int PORT = 8888;

		try {
			socket = new DatagramSocket();
			String msg;

			while (true) {
				int i = 1;
				msg = "Message number " + i + " from other user.";
				i++;
				
				outBuf = msg.getBytes();

				//Send to multicast IP address and port
				InetAddress address = InetAddress.getByName("224.2.2.3");
				outPacket = new DatagramPacket(outBuf, outBuf.length, address, PORT);

				socket.send(outPacket);
				
				try {
					Thread.sleep((long) (Math.random() * 20000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} 
		catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}