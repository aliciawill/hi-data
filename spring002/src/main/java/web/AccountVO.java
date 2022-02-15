package web;

public class AccountVO {

	private String name;
	private String accName;
	private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "계좌 [이름=" + name + ", 계좌이름=" + accName + ", 금액=" + amount + "]";
	}
	
	
}
