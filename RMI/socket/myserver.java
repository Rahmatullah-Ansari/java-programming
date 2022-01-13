package RMI.socket;

// Java program to illustrate Server side 
// programming using DatagramSocket. 
import java.io.*;
import java.net.*; 
public class myserver 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// Step 1 : Create a socket to listen at port 1234 
		DatagramSocket ds = new DatagramSocket(3500); 
        System.out.println("server started...");
		byte[] get = new byte[4500];  
		DatagramPacket dp = null;
		while (true) 
		{ 
			dp = new DatagramPacket(get, get.length); 
			ds.receive(dp); 
			System.out.println("Client:" + data(get));  
			if (data(get).toString().equals("exit")) 
			{ 
				System.out.println("Finished!!"); 
				break; 
			}
			get = new byte[4500]; 
		} 
	}  
	public static StringBuilder data(byte[] arr) 
	{ 
		if (arr == null) 
			return null; 
		StringBuilder sb = new StringBuilder(); 
		int i = 0; 
		while (arr[i] != 0) 
		{ 
			sb.append((char) arr[i]); 
			i++; 
		} 
		return sb; 
	} 
} 
