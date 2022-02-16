-- big.`member` definition

CREATE TABLE `member` (
  `id` varchar(100) DEFAULT NULL,
  `pw` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SQL(Structured Query Languages)
- Data Definition Languages(DDL)
	: 테이블 생성, 수정, 삭제, 제약조건 
- Data Manipulation Lanagues(DML)
    : crud
- Data Control Languages(DCL)
	: commit/rollback, backup/restore

-- melon 추가 : melon, 1234, melon song, 013
-- String sql = "insert '~~~~'";
insert into member values ('melon', '1234', 'melon song', '013')
-- spring 추가 : spring, 3333, spring song
insert into member(id,pw,name) values ('spring', '3333', 'spring song')
-- melon 검색, 전체 member검색

select * from member where id = 'melon'

select * from member

select id from member 

select name, id from member
-- pw가 1234검색

select * from member where pw = '1234'


-- id가 apple, pw가 1234인 사람을 검색

select * from member where id = 'apple' and pw = '1234'

-- id가 melon인 사람의 전화번호 333으로 변경

update member set tel = '333' where id = 'melon'

select tel from member where id = 'melon'
-- pw가 1234이면서, tel이 011인 사람의 
-- 이름을 red로 변경

update member set name = 'red' where pw = '1234' and tel = '011'

update member set pw = '999', name = 'blue' where tel = '011'

select * from member
-- id가 melon인 사람을 탈퇴 

delete from member where id = 'melon'
	


delete from book

CREATE TABLE `book` (
  `id` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO big.book (id,name,url,img) VALUES
	 ('1','naver','http://www.naver.com','naver.png'),
	 ('2','daum','http://www.daum.net','daum.png'),
	 ('3','google','http://www.google.com','google.png'),
	 ('4','kg','http://www.kgitbank.com','kg.png'),
	 ('5','cafe','http://cafe.daum.net/kgjava','cafe.png');


select * from book




