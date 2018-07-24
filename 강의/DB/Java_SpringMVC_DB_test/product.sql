drop table Product;
create table Product(
 num number(4) primary key,
 name varchar2(16),
 price number(15)
);

drop sequence dept_exam_seq;
create sequence dept_exam_seq
start with 0
increment by 1
minvalue 0;