package com.spring.survey.command;

import java.util.List;

public class AnsweredData {
 private List<String> responses;//응답 결과
 private Respondent res;//age,location
 
public List<String> getResponses() {
	return responses;
}
public void setResponses(List<String> responses) {
	this.responses = responses;
}
public Respondent getRes() {
	return res;
}
public void setRes(Respondent res) {
	this.res = res;
}
 
 
}
