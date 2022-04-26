package 인터페이스사용;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ClickEvent1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//인터페이스에 정의되어있었던 추상메서드를 구현해해주면 됨.
		JOptionPane.showMessageDialog(null, "첫 번째 이벤트처리군요");

	}

}
