public class Implementation extends Abstraction implements Introdution, DoSomething{

	@Override
	public void doYourself() {
		// TODO Auto-generated method stub
		System.out.println("추상 메소드는 여기서 구현.");
	}
	public void printIntroduce(){
		System.out.println("너의 이름은 : " + name);
	}
	@Override
	public void doThat() {
		// TODO Auto-generated method stub
		System.out.println("자기소개를 합니다.");
	}

}
