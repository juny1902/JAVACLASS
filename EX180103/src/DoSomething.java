
public interface DoSomething {
	static void doBasic(){
		System.out.println("�Ӛ�");
	}
	default void doIt(){
		System.out.println("���K���K");
	}
	public void doThat();
}