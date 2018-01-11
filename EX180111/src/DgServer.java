import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class DgServer {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket();

		System.out.println("[발신 시작]");

		for (int i = 1; i < 3; i++) {
			String data = "메시지 " + i;
			byte[] byteArr = data.getBytes("UTF-8"); // 문자열을 byte 배열로 변환하여 저장.

			DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length,
					new InetSocketAddress("localhost", 5001)); // 패킷 묶기

			datagramSocket.send(packet); // 묶은 패킷 전송.
			System.out.println("보낸 바이트 수 : " + byteArr.length);
		}
		System.out.println("[발신 종료]");
		datagramSocket.close();
	}
}
