package javaBPIT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class StudentDetail implements Serializable{
	
	private static final long serialVersionUID = 42L;
	private String name;
	private String colname;
	private int id;
	
	StudentDetail(int id,String name,String colname){
		this.id =id;
		this.name = name;
		this.colname = colname;
	}
	public String toString() {
		return "Name:"+this.name+" ,id:"+this.id+" ,College Name:"+this.colname;
	}
}

public class FileIOStream {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		System.out.println("Trying Different File Streams: \n1.Byte Streams \n2.Character Streams");
		System.out.println("Trying Byte Stream....");
		System.out.print("Write Something to save:");
		String input = scanner.nextLine();
		
		try {
			
			FileOutputStream fout1 = new FileOutputStream("index1.txt");
			byte[] arr = input.getBytes();
			fout1.write(arr,0,arr.length);
			fout1.flush();
			fout1.close();
			
			System.out.println("Your Input Has been saved....");
			System.out.println("Displaying saved Results:");
			
			FileInputStream fin1 = new FileInputStream("index1.txt");
			byte[] arr2 = fin1.readAllBytes();
			
			String result="";
			
			for(byte b : arr2) {
				 result += (char) b;
			}
			System.out.println(result);
			fin1.close();
						
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		
		try {
			System.out.println("Trying Character Stream....");
			FileWriter fout2 = new FileWriter("index2.txt");
			input=null;
			
			System.out.print("Write Something to save:");
			input=scanner.nextLine();
			
			fout2.write(input);
			fout2.flush();
			fout2.close();
			
			System.out.println("Your Input Has been saved....");
			System.out.println("Displaying saved Results:");
			
			FileReader fin2 = new FileReader("index2.txt");
			
			char[] arr2 = new char[100];
			fin2.read(arr2);
			for(char ch : arr2) {
				System.out.print(ch);
			}
			System.out.println();
			fin2.close();
						
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		
		StudentDetail stud1 = new StudentDetail(1,"Akshat Jamwal","BPIT");
		
		System.out.println("Object Serialization Done...");
		try {
			FileOutputStream fout = new FileOutputStream("index.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(stud1);
			out.flush();
			out.close();
			fout.close();
			
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Object Deserialization Done.....");
		
		StudentDetail stud2;
		
		try {
			FileInputStream fin = new FileInputStream("index.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			
			 stud2 = (StudentDetail) in.readObject();
			 System.out.println("Object Details Display Done.....");
			 System.out.println(stud2.toString());
			 
			 fin.close();
			 in.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		
		
	}
}
