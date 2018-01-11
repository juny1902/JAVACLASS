import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkServer {
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket();
		s.bind(new InetSocketAddress("localhost", 8080));
		while (true) {
			System.out.println("Connection awaiting...");
			Socket socket = s.accept(); // ���� ��� (Listening)
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); // ����� ������ ������ �ּ� ����.
			
			byte[] bytes = new byte[100]; // ����Ʈ ��Ʈ���� �ޱ� ���� �ӽ� ����.
			String message = null; // ���ڿ� ����.

			
			InputStream is = socket.getInputStream(); // �������� ���� ��ǲ��Ʈ�� ����.

			int readByteCount = is.read(bytes); // bytes �迭�� �о�� �� ����.
			message = new String(bytes, 0, readByteCount, "UTF-8"); // bytes �迭�� ���� ���ڿ� ���·� ���ġ.
			
			System.out.printf("[%s] %s", isa.getAddress(), message);
		}
	}
}
