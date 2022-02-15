package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	//DAO: Data Access Object
	//CRUD(크루드)
	//회원가입(Create)
	//회원정보검색, 로그인(Read)
	//회원정보수정(Update)
	//회원탈퇴(Delete)
	public void create(MemberVO vo) throws Exception {
		System.out.println("dao에서 전달받은 값:" + vo);
		String id2 = vo.getId();
		String pw2 = vo.getPw();
		String name2 = vo.getName();
		String tel2 = vo.getTel();
		
		System.out.println("전달받은 id는 " + id2);
		System.out.println("전달받은 pw는 " + pw2);
		System.out.println("전달받은 name는 " + name2);
		System.out.println("전달받은 tel는 " + tel2);
		
		System.out.println("회원가입 처리 요청됨.");
		
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공@@@");
		
		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url = "jdbc:mysql://localhost:3306/big";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db연결 성공@@@");
		
		//3. sql문을 생성
		String sql = "insert into member values (?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공.@@@");
		ps.setString(1, id2);
		ps.setString(2, pw2);
		ps.setString(3, name2);
		ps.setString(4, tel2);
		
		//4. 생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.@@@");
	}
	public void login(MemberVO vo) {
		System.out.println("회원 로그인 처리 요청됨.");
	}
	public MemberVO readOne(MemberVO vo) throws Exception {
		System.out.println("회원정보 검색 처리 요청됨.");
		System.out.println("dao에서 전달받은 값:" + vo);
		String id2 = vo.getId();
		System.out.println("전달받은 id는 " + id2);
		System.out.println("회원가입 처리 요청됨.");
		
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공@@@");
		
		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db연결 성공@@@");
		
		//3. sql문을 생성
		String sql = "select * from member where id = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공.@@@");
		ps.setString(1, id2);
		
		//4. 생성한 sql문을 mysql로 보낸다.
		ResultSet rs = ps.executeQuery();
		//System.out.println("결과값 있는지 체크 결과는 >>" + rs.next());
		System.out.println("4. SQL문 전송 성공.@@@");
		MemberVO vo2 = new MemberVO();
		if(rs.next()) {
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			vo2.setId(id);
			vo2.setPw(pw);
			vo2.setName(name);
			vo2.setTel(tel);
		}else {
			System.out.println("검색 결과 없음.");
		}
		return vo2;
		
	}
	public ArrayList<MemberVO> readAll() throws Exception {
		System.out.println("회원전체 목록 검색 처리 요청됨.");
		
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공@@@");
		
		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db연결 성공@@@");
		
		//3. sql문을 생성
		String sql = "select * from member";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공.@@@");
		
		//4. 생성한 sql문을 mysql로 보낸다.
		ResultSet rs = ps.executeQuery();
		//System.out.println("결과값 있는지 체크 결과는 >>" + rs.next());
		System.out.println("4. SQL문 전송 성공.@@@");
		//가방들을 모을 저장공간을 만들어야 함.
		//배열은 적합하지 않음.
		//MemberVO[] list = new MemberVO[10]();
		//가변적인 저장공간이 필요.
		ArrayList<MemberVO> list = new ArrayList<>();
		while(rs.next()) {
			MemberVO vo2 = new MemberVO();
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			vo2.setId(id);
			vo2.setPw(pw);
			vo2.setName(name);
			vo2.setTel(tel);
			list.add(vo2);
		}
		return list;
		
	}
	public void update(MemberVO vo) throws Exception {
		System.out.println("회원수정 처리 요청됨.");
		System.out.println("dao에서 전달받은 값:" + vo);
		String id2 = vo.getId();
		String pw2 = vo.getPw();
		String name2 = vo.getName();
		String tel2 = vo.getTel();
		
		System.out.println("전달받은 id는 " + id2);
		System.out.println("전달받은 pw는 " + pw2);
		System.out.println("전달받은 name는 " + name2);
		System.out.println("전달받은 tel는 " + tel2);
		
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공@@@");
		
		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url = "jdbc:mysql://localhost:3306/big";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db연결 성공@@@");
		
		//3. sql문을 생성
		String sql = "update member set tel = ? where id = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공.@@@");
		ps.setString(1,tel2);
		ps.setString(2,id2);

		
		//4. 생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.@@@");
	}
	public void delete(MemberVO vo) throws Exception {
		System.out.println("회원탈퇴 처리 요청됨.");
		System.out.println("dao에서 전달받은 값:" + vo);
		String id2 = vo.getId();
		String pw2 = vo.getPw();
		String name2 = vo.getName();
		String tel2 = vo.getTel();
		
		System.out.println("전달받은 id는 " + id2);
		System.out.println("전달받은 pw는 " + pw2);
		System.out.println("전달받은 name는 " + name2);
		System.out.println("전달받은 tel는 " + tel2);
		
		
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공@@@");
		
		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url = "jdbc:mysql://localhost:3306/big";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db연결 성공@@@");
		
		//3. sql문을 생성
		String sql = "delete from member where id = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공.@@@");
		ps.setString(1, id2);

		
		//4. 생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.@@@");
	}
}