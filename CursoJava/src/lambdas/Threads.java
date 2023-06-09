package lambdas;

public class Threads {
	
	public static void main(String[] args) {
		
		
		
		
		Runnable t1 = new Trabalho1();
		Runnable t2 = new Runnable() {
			
			@Override
			public void run() {
			
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						
					}
					
				}
				
				
			}
		};
		
//		Runnable t3 = () ->{
//		
//		};

		Runnable t3 = Threads::trabalho3;
		
	Thread thread1 = new Thread(t1);
	Thread thread2 = new Thread(t2);
	Thread thread3 = new Thread(t3);

	thread1.start();
	thread2.start();
	thread3.start();
		
	}
	
	static void trabalho3() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #03");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}	
		}
		
	}
	
}
