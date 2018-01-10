package networkTest;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {

		try {
			ServerSocket serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println("�� �̸��� " + ia.getHostName());
			System.out.println("�� �ּҴ� " + ia.getHostAddress());
			while (true) {
				System.out.println("[���� ���]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������] " + isa.getHostName());

				byte[] bytes = null;
				String message = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("�޽��� : " + message);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}