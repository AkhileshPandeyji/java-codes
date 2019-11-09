package javaBPIT;

import java.util.Scanner;
import java.util.StringTokenizer;

interface StudentActions {
	void setName(String name);

	String getName();

	void setId(int id);

	int getId();

	void setIsFeesSubmitted(boolean value);
	
	boolean isFeesSubmitted();
}

class Department {
	protected String dname;
	protected String hod;
	protected String[] dsocenrol;

	Department() {
		this.dname = null;
		this.hod = null;
		this.dsocenrol = null;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}

	public String getDsocenrol() {
		String temp = "";
		for (String name : this.dsocenrol) {
			temp += name + ",";
		}
		return temp.substring(0, temp.length() - 1);
	}

	public void setDsocenrol(String[] dsocenrol) {
		this.dsocenrol = dsocenrol;
	}

}

class Student extends Department implements StudentActions {
	private String name;
	private int id;
	private boolean feesSubmitted;
	private static int classno;

	Student() {
		super();
		this.name = null;
		this.id = -1;
		this.feesSubmitted = false;
		classno = -1;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setId(int id) {
		this.id = id;

	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setIsFeesSubmitted(boolean value) {
		this.feesSubmitted = value;
	}

	@Override
	public boolean isFeesSubmitted() {
		return this.feesSubmitted;
	}

	public String toString() {
		return "Name:" + this.name + " ,Id:" + this.id + " ,Department:" + this.dname + " is enrolled in "
				+ this.getDsocenrol() + " societies.";
	}

	public static void showClassNo() {
		System.out.println(classno);
	}
}

public class MiniProject {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Akhilesh Kumar Pandey \t \t 00620802717");
		System.out.println("######### STUDENT ADMISSION SYSTEM  ######");

		System.out.println("Creating Student");
		Student s1 = new Student();
		System.out.print("Enter the name of the student:");
		String name = scanner.nextLine();
		s1.setName(name);
		System.out.print("Enter the enrollment id of the student:");
		int id = scanner.nextInt();
		scanner.nextLine();
		s1.setId(id);
		System.out.print("Enter the student's Department name:");
		String dname = scanner.next();
		scanner.nextLine();
		s1.setDname(dname);
		System.out.print("Enter the Department's HOD name:");
		String hod = scanner.nextLine();
		s1.setHod(hod);		
		System.out.print("Has student submitted fees:");
		boolean value = Boolean.valueOf(scanner.next());
		scanner.nextLine();
		s1.setIsFeesSubmitted(value);
		System.out.print("Enter the socities wish to enroll in:");
		String soc1 = scanner.next();	
		scanner.nextLine();
		StringTokenizer token = new StringTokenizer(soc1,",");
		String[] soc2 = new String[token.countTokens()];
		int i = 0;
		while(token.hasMoreTokens()) {
			soc2[i] = token.nextToken();
			i++;
		}
		s1.setDsocenrol(soc2); 
		System.out.println("Added..");
		System.out.println(s1.toString());

	}

}
