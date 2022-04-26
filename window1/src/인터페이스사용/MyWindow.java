package 인터페이스사용;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//static메서드로 만들어놓았음.
				//자주 쓰는 메서드(함수)나 변수는 static으로 만들어놓으면
				//클래스이름으로 언제든 접근해서 쓸 수 있음. 
				JOptionPane.showMessageDialog(b1, "나를클릭했군요@@@@");
			}
		});
		b1.setBounds(136, 18, 208, 140);
		b1.setText("나를 눌러요");
		b1.setBackground(Color.yellow); //배경색 
		b1.setForeground(Color.blue); //글자색
		
		Font font = new Font("궁서", Font.BOLD, 30);
		f.setLayout(null);
		b1.setFont(font);
		
		f.getContentPane().add(b1);//Component interface <--- JButton
		
		JButton btnNewButton = new JButton("나도 눌러요");
		btnNewButton.setFont(new Font("Al Tarikh", Font.BOLD, 35));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(136, 185, 200, 80);
		f.getContentPane().add(btnNewButton);
		//클래스의 다형성(업캐스팅, 자동형변환)
		//맨 끝!!
		
		f.setVisible(true);
	}
}
