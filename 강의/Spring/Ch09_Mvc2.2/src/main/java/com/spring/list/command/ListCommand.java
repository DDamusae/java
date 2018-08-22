package com.spring.list.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ListCommand {
	//문자열("2018081500") => 2018년 8월 15일 00시
	//입력 형식이 맞아야하고, 그렇지 않으면 예외 발생
	@DateTimeFormat(pattern="yyyyMMddHH")
	private Date from;
	
	@DateTimeFormat(pattern="yyyyMMddHH")
	private Date to;
	
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	
}
