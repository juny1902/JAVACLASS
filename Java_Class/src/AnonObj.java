interface Action {
	void work();
}

public class AnonObj {
	Action action = new Action() {
		public void work(){
			System.out.println("���縦 �մϴ�.");
		}
	};
}
