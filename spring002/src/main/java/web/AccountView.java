package web;

import javax.swing.JOptionPane;

public class AccountView {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("이름 입력");
		String accName=JOptionPane.showInputDialog("계좌이름 입력");
		int amount= Integer.parseInt(JOptionPane.showInputDialog("금액 입력"));
		
		AccountVO vo=new AccountVO();
		vo.setName(name);
		vo.setAccName(accName);
		vo.setAmount(amount);
		
		AccountDAO dao=new AccountDAO();
		dao.create(vo);
		

	}

}
