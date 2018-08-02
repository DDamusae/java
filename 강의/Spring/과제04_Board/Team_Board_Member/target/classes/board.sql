drop table board;
drop sequence board_seq;

create table board(
    no number,
    title varchar2(20)
);

create SEQUENCE board_seq
minvalue 0
start with 0
INCREMENT by 1;

insert into board values(board_seq.nextval, '공지사항');
insert into board values(board_seq.nextval, '축구');
insert into board values(board_seq.nextval, '축구 동영상');
insert into board values(board_seq.nextval, '동영상');
insert into board values(board_seq.nextval, '라커룸');

select * from board;