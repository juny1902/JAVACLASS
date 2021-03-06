class Quad extends Thread {
	public Quad(ThreadGroup a, String b) {
		super(a, b);
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("[%s]", getName());
		}
	}
}

class One extends Thread {
	public One(ThreadGroup a, String b) {
		super(a, b);
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("[%s]", getName());
			
		}
	}
}

class Octa extends Thread {
	public Octa(ThreadGroup a, String b) {
		super(a, b);
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("[%s]", getName());
		}
	}
}

class Sixt extends Thread {
	double t = 0;

	public Sixt(ThreadGroup a, String b) {
		super(a, b);
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(125);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t += 0.125;
			System.out.printf("[%s]", getName());
		}
	}
}

class Th extends Thread{
	double t = 0;
	
	public Th(ThreadGroup a, String b) {
		super(a, b);
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(67);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t += 0.067;
			System.out.printf("[%s]\t\t\t%.3f 초 경과 !\n", getName(), t);
		}
	}
	
}

public class groupThread {
	public static void main(String[] args) {
		ThreadGroup grp = new ThreadGroup("음표들");
		Quad a = new Quad(grp, "4분음표");
		One b = new One(grp, "온음표");
		Octa c = new Octa(grp, "8분음표");
		Sixt d = new Sixt(grp, "16분음표");
		Th e = new Th(grp,"32분음표");
		grp.setDaemon(true);
		e.start();
		d.start();
		c.start();
		b.start();
		a.start();

		while (true) {
		}
	}
}
