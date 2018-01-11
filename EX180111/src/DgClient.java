import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
public class DgClient extends Thread {
	public static void main(String[] args) throws SocketException, InterruptedException {
		DatagramSocket datagramSocket = new DatagramSocket(5001); // DGRAM 소켓 생성.

		Thread thread = new Thread() { // 익명 구현
			@Override
			public void run() {
				System.out.println("[수신 시작]");
				try {
					while (true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100); // 패킷 객체 초기화
						datagramSocket.receive(packet); // 패킷 읽어옴.
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("읽은 내용 : " + data + packet.getAddress() + ":" +packet.getPort());
					}
				} catch (Exception e) {
					System.out.println("[수신 종료]");
				}

			}
		};

		thread.start();
		Thread.sleep(10000);
		datagramSocket.close();
	}
}
