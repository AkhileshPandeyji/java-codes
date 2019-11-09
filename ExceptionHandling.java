package javaBPIT;


class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public String toString() {
		return "User Defined Exception";
	}
	
}

public class ExceptionHandling {
	public static void throwingException() throws MyException {
		System.out.println("Throwing exception....");
		throw new MyException();
	}
	public static void main(String[] args) {
		
		System.out.println("Akhilesh Kumar Pandey \t \t 00620802717");
		try {
			System.out.println("Inside try Block");
			throwingException();
		}
		catch(MyException e) {
			System.out.println("Catching Exception....");
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Running after try catch block statements executed....");
		}
	}

}
