import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
public class DgClient extends Thread {
	public static void main(String[] args) throws SocketException, InterruptedException {
		DatagramSocket datagramSocket = new DatagramSocket(5001); // DGRAM ���� ����.

		Thread thread = new Thread() { // �͸� ����
			@Override
			public void run() {
				System.out.println("[���� ����]");
				try {
					while (true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100); // ��Ŷ ��ü �ʱ�ȭ
						datagramSocket.receive(packet); // ��Ŷ �о��.
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("���� ���� : " + data + packet.getAddress() + ":" +packet.getPort());
					}
				} catch (Exception e) {
					System.out.println("[���� ����]");
				}

			}
		};

		thread.start();
		Thread.sleep(10000);
		datagramSocket.close();
	}
}
