package sec06.exam02_yield;

public class YieldExample {
	public static void main(String[] args) throws InterruptedException {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();	
		threadA.start();		
		threadB.start();
		
		Thread.sleep(1000);
		System.out.println("3�ʰ� AB Ȱ��ȭ");
		try { 
			
			Thread.sleep(3000); } catch (InterruptedException e) {}
		
		Thread.sleep(1000);
		System.out.println("3�ʰ� A ��Ȱ��ȭ");
		threadA.work = false;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		
		Thread.sleep(1000);
		System.out.println("3�ʰ� AB Ȱ��ȭ");
		threadA.work = true;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
