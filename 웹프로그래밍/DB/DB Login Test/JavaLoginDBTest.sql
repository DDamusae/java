create table member(
 id varchar2(10) primary key,
 passwd varchar2(10),
 name varchar2(10),
 age number,
 loc varchar2(10),
 email varchar2(10)
);

INSERT INTO member VAlUES('aaa','aaa','홍길동',22,'서울시','a@a.com');
INSERT INTO member VAlUES('bbb','bbb','알파고',21,'제주시','b@b.com');
INSERT INTO member VAlUES('ccc','ccc','베타고',22,'광주시','c@c.com');
INSERT INTO member VAlUES('ddd','ddd','감마고',22,'울산시','d@d.com');
INSERT INTO member VAlUES('eee','eee','세타고',22,'이리시','e@e.com');