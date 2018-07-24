-- auto_increment => sequence
--  (MySQL)    		 (Oracle)

create table guestbook_message(
	message_id number not null primary key,
	guest_name varchar2(50) not null,
	password varchar2(10) not null,
	message long not null
);

create sequence guestbook_seq
START WITH 1 
INCREMENT BY 1 
MINVALUE 1;

commit;