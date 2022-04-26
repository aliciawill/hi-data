package 인터페이스사용;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class MyWindow2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		//위치를 내 마음대로 지정할 수 있음.
		f.getContentPane().setLayout(null);
		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		
		JButton b1 = new JButton();
		b1.setText("나를 눌러요");
		b1.setFont(font);
		
		f.add(b1);
		b1.setBounds(50, 100, 200, 100);
		b1.setForeground(Color.blue);
		
		JButton b2 = new JButton();
		b2.setText("나도 눌러요");
		b2.setFont(font);
		
		f.add(b2);
		b2.setBounds(260, 100, 200, 100); //x, y, 가로, 세로 
		b2.setForeground(Color.red);
		
		JButton b3 = new JButton();
		b3.setText("나를 또 눌러요");
		b3.setFont(font);
		
		f.add(b3);
		b3.setBounds(50, 200, 200, 100);
		b3.setForeground(Color.blue);
		
		JButton b4 = new JButton();
		b4.setText("나도 또 눌러요");
		b4.setFont(font);
		
		f.add(b4);
		b4.setBounds(260, 200, 200, 100);
		b4.setForeground(Color.red);
		
		
		f.setVisible(true);
	}
}
