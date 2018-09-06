
-----------------------------------Part 1-------------------
drop table tbl_member;

create table tbl_member(
	userid varchar(50) not null,
	userpw varchar(50) not null,
	username varchar(50) not null,
	email varchar(100),
	regdate timestamp default now(),
	updatedate timestamp default now(),
	primary key(userid)
)engine=InnoDB character set=utf8;

--------------------------------Part2 ---------------------------
drop table tbl_board;

create table tbl_board(
	bno int not null auto_increment,
	title varchar(200) not null,
	content text null,
	writer varchar(50) not null,
	regdate timestamp not null default now(),
	viewcnt int default 0,
	primary key(bno)
)engine=InnoDB character set=utf8;;

insert into tbl_board(title, content, writer) values('제목입니다','내용입니다','user00');

insert into tbl_board(title, content, writer)
(select title, content, writer from tbl_board)

select * from tbl_board where bno > 0 order by bno desc limit 0,10;
select * from tbl_board where bno > 0 order by bno desc limit 10,10;








