package RMI.socket;

// Java program to illustrate Client side 
// programming using Datagram socket. 
import java.io.*;
import java.net.*;
import java.util.*; 
public class myclient 
{ 
	public static void main(String args[]) throws IOException 
	{ 
		Scanner sc = new Scanner(System.in); 
		DatagramSocket ds = new DatagramSocket(); 
		InetAddress ip = InetAddress.getLocalHost(); 
		byte buffer[] = null; 
		while (true) 
		{ 
            String input = sc.nextLine(); 
			buffer = input.getBytes(); 
			DatagramPacket dp =new DatagramPacket(buffer, buffer.length, ip,3500); 
			ds.send(dp);
			if (input.equals("exit")) 
				break; 
		} 
	}
}