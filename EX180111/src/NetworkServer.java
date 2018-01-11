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
			Socket socket = s.accept(); // 연결 대기 (Listening)
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); // 연결된 소켓의 목적지 주소 얻음.
			
			byte[] bytes = new byte[100]; // 바이트 스트림을 받기 위한 임시 공간.
			String message = null; // 문자열 공간.

			
			InputStream is = socket.getInputStream(); // 소켓으로 부터 인풋스트림 얻음.

			int readByteCount = is.read(bytes); // bytes 배열에 읽어온 값 저장.
			message = new String(bytes, 0, readByteCount, "UTF-8"); // bytes 배열의 값을 문자열 형태로 재배치.
			
			System.out.printf("[%s] %s", isa.getAddress(), message);
		}
	}
}
