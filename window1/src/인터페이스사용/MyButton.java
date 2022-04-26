package 인터페이스사용;

import javax.swing.JButton;

public class MyButton extends JButton {

	boolean state = false;
	String text = null;
	
	@Override
	public void setText(String text) {
		super.setText(text);
		this.text = text;
	}

	
	public MyButton(String text) {
		super();
		setText(text);
		this.state = state;
	}


	public void click() {
		System.out.println("버튼을 클릭했군.>> " + text);
	}
}
