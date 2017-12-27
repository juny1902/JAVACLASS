interface DB {
	void select();

	void insert();

	void update();

	void delete();
}
abstract class ReadOnlyDB implements DB{
	public void select(){
		System.out.println("검색헀습니다.");
	}
}
class MyDao implements DB {
	public void select() {
		System.out.println("My DB에서 검색");
	}

	public void insert() {
		System.out.println("My DB에서 추가");
	}

	public void update() {
		System.out.println("My DB에서 업데이트");
	}

	public void delete() {
		System.out.println("My DB에서 삭제");
	}
}

class OracleDao implements DB {
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	public void insert() {
		System.out.println("Oracle DB에서 추가");
	}

	public void update() {
		System.out.println("Oracle DB에서 업데이트");
	}

	public void delete() {
		System.out.println("Oracle DB에서 삭제");
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
