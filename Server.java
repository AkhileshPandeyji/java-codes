package javaBPIT;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Server {

	private static Scanner scanner = new Scanner(System.in);
	private static ServerSocket s;
	private static DataInputStream din;
	private static DataOutputStream dout;
	private static String response;
	private static String request;
	private static PreparedStatement stmt;
	private static int count;

	public static void main(String[] args) throws Exception {

		try {
			s = new ServerSocket(6666);
			Socket server = s.accept();
			din = new DataInputStream(server.getInputStream());
			dout = new DataOutputStream(server.getOutputStream());

			// JDBC Stuff

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clientreq", "root",
					null);
			String sql = "insert into requests values(?,?) ";
			stmt = con.prepareStatement(sql);

			response = "";
			request = "";
			count = 0;

			int mode = 0;
			System.out.println("Akhilesh Kumar Pandey \t\t 00620802717");
			System.out.println("Server has started working......");
			while (mode != 3) {
				System.out.println("Enter the mode :\n1.Reading mode \n2.Writing mode \n3.Exit Server");
				mode = scanner.nextInt();
				scanner.nextLine();
				switch (mode) {
				case 1:
					serverRead();
					break;
				case 2:
					serverWrite();
					break;
				}
			}
			System.out.println("Server has stopped working......");
			din.close();
			dout.close();
			server.close();
			s.close();
		} catch (SocketException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

	private static void serverWrite() throws Exception {
		while (!response.equals("stop")) {
			System.out.println("write:");
			response = scanner.nextLine();
			dout.writeUTF(response);
			dout.flush();
		}

	}

	private static void serverRead() throws Exception {
		while (!request.equals("stop")) {
			System.out.println("Reading:");
			request = din.readUTF();
			count+=1;
			System.out.println(request);
			
			//JDBC stuff
			stmt.setInt(1, count);
			stmt.setString(2, request);			
			stmt.execute();
			
			System.out.println("Request Saved to Database");

		}

	}

}
