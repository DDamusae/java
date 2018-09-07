package com.spring.register.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.register.command.RegisterRequest;

public class RegisterRequestValidator implements Validator {
	
	private Pattern pattern;
	
	// 예) abcd@abcdddd.com
	private static final String emailRegExp = "^[A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public RegisterRequestValidator() {
		pattern = Pattern.compile(emailRegExp);
	}
	
	//Validator가 검증할 수 있는 Type인지 검사
	@Override
	public boolean supports(Class<?> clazz) {
		return RegisterRequest.class.isAssignableFrom(clazz); //boolean
	}

	//첫번째Parameter로 전달받은 객체를 검증하고 그 결과를 Error에 담는 기능
	@Override
	public void validate(Object target, Errors errors) {
		//방법1
		RegisterRequest regReq = (RegisterRequest) target;
		if(regReq.getEmail() == null || regReq.getEmail().trim().isEmpty()) {
			//검사 결과 error code 설정하기 위한 코드
			//email property에 에러코드로 "required"를 추가한다.
			errors.rejectValue("email", "required");
		}else {
			Matcher matcher = pattern.matcher(regReq.getEmail());
			if(!matcher.matches()) {
				errors.rejectValue("email", "bad");
			}
		}
		
		//방법2: 객체의 값 검증 코드를 간결하게 한 형태
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");
		ValidationUtils.rejectIfEmpty(errors, "password", "required");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "required");
		
		//비밀번호가 다른 경우
		if(!regReq.isPasswordEqualToConfirmPassword()) {
			errors.rejectValue("confirmPassword", "nomatch");
		}
	}
}
