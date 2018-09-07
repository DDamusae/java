drop table team;
drop sequence team_seq;

create table team(
    team_id number,
    name varchar2(200)
);

create sequence team_seq
minvalue 0
start with 0
increment BY 1;

insert into team values(team_seq.nextval, '맨시티');
insert into team values(team_seq.nextval, '맹구');
insert into team values(team_seq.nextval, '리버풀');
insert into team values(team_seq.nextval, '토트넘');
insert into team values(team_seq.nextval, '아스날');

select * from team;