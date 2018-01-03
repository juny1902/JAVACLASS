package sec08.exam01_abstract_class;

public class TouchPhone extends Phone{
	private int scrSize;
	public TouchPhone(String owner, int scrSize) {
		super(owner);
		this.scrSize = scrSize;
		// TODO Auto-generated constructor stub
	}
	void scrSize(){
		System.out.println(super.owner + "의 휴대폰, 액정 크기는 " + scrSize + "인치.");
	}

}
