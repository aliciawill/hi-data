package web;

public class AccountDAO {
	//CRUD
	public void create(AccountVO vo)
	{
		System.out.println("dao에서 전달받은 값:"+vo);
		String name=vo.getName();
		String accName=vo.getAccName();
		int amount=vo.getAmount();
		
		System.out.println("전달받은 name은 "+name);
		System.out.println("전달받은 accName은 "+accName);
		System.out.println("전달받은 amount는 "+amount);
		System.out.println("계좌생성 처리 요청됨.");
	}
	public void read(AccountVO vo)
	{
		System.out.println("계좌조회 처리 요청됨");
	}
	public void update(AccountVO vo)
	{
		System.out.println("계좌정보 수정 처리 요청됨");
	}
	public void delete(AccountVO vo)
	{
		System.out.println("계좌삭제 처리 요청됨");
	}
	
	//create 기능만 호출. vo만들어서 넣어서 전달
}
