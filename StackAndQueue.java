package javaBPIT;


class Stack<T>{
	final int SIZE = 100;
	private int top;
	@SuppressWarnings("unused")
	private T temp;
	private T[] a;
	@SuppressWarnings("unchecked")
	Stack(){
		this.top = 0;
		try {
		 this.a = (T[]) new Object[this.SIZE];
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	void push(T val){
		if (this.top>=this.SIZE) {
			System.out.println("Overflow");
			return;
		}
		this.a[this.top] = val;
		this.top++;
		
	}
	void pop(){
		if (this.top<0) {
			System.out.println("Underflow");
			return;
		}
		this.temp = this.a[this.top] ;
		top--;
		
	}
	void print() {
		if (this.top<0) {
			System.out.println("Nothing to print...");
			return;
		}
		
		for(int i=0 ; i<this.top ; i++) {
			System.out.print("->");
			System.out.print(this.a[i]);
		}
		System.out.println();
	}
}

class Queue<T>{
	private final int SIZE = 100;
	@SuppressWarnings("unused")
	private T temp;
	private int front;
	private int rear;
	private T[] a;
	@SuppressWarnings("unchecked")
	Queue(){
		this.a = (T[]) new Object[this.SIZE];
		this.front = 0;
		this.rear = 0;
	}
	void push(T val){
		if (this.rear>=this.SIZE) {
			System.out.println("Overflow");
			return;
		}
		this.a[this.rear] = val;
		this.rear++;
		
	}
	void pop(){
		if (this.front == this.rear) {
			System.out.println("Underflow");
			return;
		}
		this.temp = this.a[this.front] ;
		this.front++;
		
	}
	void print() {
		if (this.front == this.rear) {
			System.out.println("Nothing to print...");
			return;
		}
		
		for(int i=this.front ; i<this.rear ; i++) {
			System.out.print("->");
			System.out.print(this.a[i]);
		}
		System.out.println();
	}
	
	
}

public class StackAndQueue {

	public static void main(String[] args) {
		
		System.out.println("Akhilesh Kumar Pandey \t \t 00620802717");
		System.out.println("STACK Implementation for Integers ..... :");
		Stack<Integer> s = new Stack<Integer>();
		System.out.println("Pushing 5,6,7,8 ....");
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		System.out.println("Displaying ...");
		s.print();
		System.out.println("Popping 1 time....");
		s.pop();
		System.out.println("Displaying....");
		s.print();
		
		System.out.println("STACK Implementation for Booleans ..... :");
		Stack<Boolean> s2 = new Stack<Boolean>();
		System.out.println("Pushing true,false,true,true ....");
		s2.push(true);
		s2.push(false);
		s2.push(true);
		s2.push(true);
		System.out.println("Displaying ...");
		s2.print();
		System.out.println("Popping 1 time....");
		s2.pop();
		System.out.println("Displaying....");
		s2.print();
		
		
		System.out.println("QUEUE Implementation for Integers ..... :");
		Queue<Integer> q = new Queue<Integer>();
		System.out.println("Pushing 32,45,56,77 ....");
		q.push(32);
		q.push(45);
		q.push(56);
		q.push(77);
		System.out.println("Displaying ...");
		q.print();
		System.out.println("Popping 1 time....");
		q.pop();
		System.out.println("Displaying....");
		q.print();
		
		System.out.println("Queue Implementation for Booleans ..... :");
		Queue<Boolean> q2 = new Queue<Boolean>();
		System.out.println("Pushing true,false,true,true ....");
		q2.push(true);
		q2.push(false);
		q2.push(true);
		q2.push(true);
		System.out.println("Displaying ...");
		q2.print();
		System.out.println("Popping 1 time....");
		q2.pop();
		System.out.println("Displaying....");
		q2.print();
		
	}

}
