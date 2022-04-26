package 인터페이스사용;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			//ActionListener인터페이스를 구현한 익명클래스의 객체를 생성하자!
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b1, "b1을 클릭했음");
				
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
		
		JButton b2 = new JButton("나도 눌러요");
		b2.setFont(new Font("Al Tarikh", Font.BOLD, 35));
		b2.setBackground(Color.CYAN);
		b2.setForeground(Color.RED);
		b2.setBounds(136, 185, 200, 80);
		f.add(b2);
		
		//클래스의 다형성(업캐스팅, 자동형변환)
		//맨 끝!!
		
		f.setVisible(true);
	}
}
