package javaBPIT;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Client {
	private static DataInputStream din;
	private static DataOutputStream dout;
	private static String response;
	private static String request;
	private static Scanner scanner;
	
	
	public static void main(String args[]) throws Exception{
		try {
			Socket client = new Socket("localhost",6666);
			dout = new DataOutputStream(client.getOutputStream());
			din = new DataInputStream(client.getInputStream());
			scanner = new Scanner(System.in);
			
			System.out.println("Akhilesh Kumar Pandey \t\t 00620802717");
			System.out.println("Client started working.....");
			
			response = "";
			request = "";
			
			int mode = 0;
			while(mode != 3) {
				System.out.println("Enter the mode: \n1.Read \n2.Write \n3.Exit");
				mode = scanner.nextInt();
				scanner.nextLine();
				
				switch(mode) {
				case 1: clientRead();
						break;
				case 2: clientWrite();
						break;
						
				}
				
			}
			
			dout.close();
			din.close();
			client.close();
		
		}
		catch(SocketException e) {
			System.out.println(e.toString());
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}


	private static void clientWrite() throws Exception {
		while(!response.equals("stopit")) {
			System.out.println("write:");
			response = scanner.nextLine();
			dout.writeUTF(response);
			dout.flush();
		}
			
		
		
	}


	private static void clientRead() throws Exception {
		
		while(!request.equals("stopit")) {
			System.out.println("Reading:");
			request = din.readUTF();
			System.out.println(request);			    
		}
		
	}
}
