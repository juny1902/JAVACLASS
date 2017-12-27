interface DB {
	void select();

	void insert();

	void update();

	void delete();
}
abstract class ReadOnlyDB implements DB{
	public void select(){
		System.out.println("�˻������ϴ�.");
	}
}
class MyDao implements DB {
	public void select() {
		System.out.println("My DB���� �˻�");
	}

	public void insert() {
		System.out.println("My DB���� �߰�");
	}

	public void update() {
		System.out.println("My DB���� ������Ʈ");
	}

	public void delete() {
		System.out.println("My DB���� ����");
	}
}

class OracleDao implements DB {
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}

	public void insert() {
		System.out.println("Oracle DB���� �߰�");
	}

	public void update() {
		System.out.println("Oracle DB���� ������Ʈ");
	}

	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
}

public class DaoExample {
	public static void dbWork(DB dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MyDao());
	}
}
