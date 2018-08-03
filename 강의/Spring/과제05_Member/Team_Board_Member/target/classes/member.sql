drop table member;

create table member(
    member_id varchar2(20),
    name varchar2(20)
);

insert into MEMBER values('11111', '박지성');
insert into MEMBER values('22222', '손흥민');
insert into MEMBER values('aaaaa', '기성용');
insert into MEMBER values('bbbbb', '김영권');
insert into MEMBER values('ccccc', '조현우');
insert into MEMBER values('ddddd', '이재성');
insert into MEMBER values('eeeee', '문선민');
insert into MEMBER values('fffff', '윤영선');

select * from member;