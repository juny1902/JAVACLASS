package Chatter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerBackground {
	ServerSocket serverSocket;
	Socket socket;

	ServerGui gui;
	String msg;

	DataInputStream in;
	DataOutputStream out;

	public final void setGui(ServerGui gui) {
		this.gui = gui;
	}

	public void Setting() {
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("대기중...");

			socket = serverSocket.accept();
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			gui.appendMsg(socket.getInetAddress() + "에서 접속하였습니다.\n");

			while (in != null) {
				msg = in.readUTF();
				gui.appendMsg(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMessage(String msg2) {
		try {
			out.writeUTF(msg2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
