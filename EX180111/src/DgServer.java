import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class DgServer {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket();

		System.out.println("[�߽� ����]");

		for (int i = 1; i < 3; i++) {
			String data = "�޽��� " + i;
			byte[] byteArr = data.getBytes("UTF-8"); // ���ڿ��� byte �迭�� ��ȯ�Ͽ� ����.

			DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length,
					new InetSocketAddress("localhost", 5001)); // ��Ŷ ����

			datagramSocket.send(packet); // ���� ��Ŷ ����.
			System.out.println("���� ����Ʈ �� : " + byteArr.length);
		}
		System.out.println("[�߽� ����]");
		datagramSocket.close();
	}
}
