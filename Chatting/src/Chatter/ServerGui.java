package Chatter;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGui extends JFrame implements ActionListener {
	JTextArea jta = new JTextArea(40, 25);
	JTextField jtf = new JTextField(25);

	ServerBackground serverBackground = new ServerBackground();

	public ServerGui() {
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(200, 100, 400, 600);
		setTitle("서버 단 ");

		serverBackground.setGui(this); // 대문자
		serverBackground.Setting(); // ?
	}

	public static void main(String[] args) {
		new ServerGui();
	}

	public void appendMsg(String msg) {
		jta.append(msg);
	}

	public void actionPerformed(ActionEvent e) {
		String msg = "서버: " + jtf.getText() + "\n";
		jta.append(msg);
		jtf.setText("");

		serverBackground.sendMessage(msg);
	}
}
