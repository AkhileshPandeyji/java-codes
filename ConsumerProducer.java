package javaBPIT;

import java.util.LinkedList;



class ProConsum{
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 2;
	
	void produce() throws InterruptedException {
		int value = 0;
		
		while(true) {
			synchronized(this) {
				if(list.size()==capacity) 
					wait();
				
				value++;
				list.add(value);
				
				System.out.println("Producer produced:"+value);
				notify();
							
				Thread.sleep(1000);
			
				}
		}
		
	}
	
	void consume() throws InterruptedException{
		
		while(true) {
			synchronized(this) {
				while(list.size() == 0)
					wait();
				
				int val = list.removeFirst();
				System.out.println("Consumer consumed:"+val);
				notify();
				
				Thread.sleep(1000);
				
			}	
		}
		
	}
	

}

public class ConsumerProducer{
	public static void main(String args[]) {
		
		System.out.println("Akhilesh Kumar Pandey \t \t 00620802717");
		ProConsum pc = new ProConsum ();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					pc.produce();
				}
				catch(InterruptedException e) {
					System.out.println(e.toString());
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					pc.consume();
				}
				catch(InterruptedException e) {
					System.out.println(e.toString());
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
		t1.join();
		t2.join();	
		}
		catch(InterruptedException e) {
			System.out.println(e.toString());
		}
		
	}
}