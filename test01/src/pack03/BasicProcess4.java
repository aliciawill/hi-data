package pack03;

import javax.swing.JOptionPane;

public class BasicProcess4 {
	public static void main(String[] args) {
//		   1) 두 수를 입력받아서
//    동일하면 동일해요!
//    동일하지 않으면 달라요! 출력
// 2) id가 root라고 입력하면 맞아요!
//    id가 root가 아닌 다른 것으로 입력하면 틀려요! 출력
// 3) id가 root, pw가 1234 입력이 둘다 맞으면 로그인 성공!
//    둘 중 하나라도 틀리면 로그인 실패!
		String id = JOptionPane.showInputDialog("id를 입력");
		String pw = JOptionPane.showInputDialog("pw를 입력");
		
		//비교처리할 예정
		if(id.equals("root") && pw.equals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인 성공. ");
		}else {
			JOptionPane.showMessageDialog(null, "로그인 실패.");
		}
	}
}
