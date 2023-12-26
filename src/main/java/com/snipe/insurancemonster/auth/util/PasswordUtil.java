package com.snipe.insurancemonster.auth.util;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordUtil {
	
	@Autowired
	static PasswordEncoder encoder;
	
	 public static String generateCommonLangPassword() {
		    String upperCaseLetters = RandomStringUtils.random(2, 65, 90, true, true);
		    String lowerCaseLetters = RandomStringUtils.random(2, 97, 122, true, true);
		    String numbers = RandomStringUtils.randomNumeric(2);
		    String specialChar = RandomStringUtils.random(2, 33, 47, false, false);
		    String totalChars = RandomStringUtils.randomAlphanumeric(2);
		    String combinedChars = upperCaseLetters.concat(lowerCaseLetters)
		      .concat(numbers)
		      .concat(specialChar)
		      .concat(totalChars);
		    List<Character> pwdChars = combinedChars.chars()
		      .mapToObj(c -> (char) c)
		      .collect(Collectors.toList());
		    Collections.shuffle(pwdChars);
		    String password = pwdChars.stream()
		      .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
		      .toString();
		 return  password;
		
		}
	
	public String generateRandomSpecialCharacters(int length) {
	    RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(33, 45)
	        .build();
	    return pwdGenerator.generate(length);
	}
	
	public String generateRandomNumbers(int length) {
	    RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(33, 45)
	        .build();
	    return pwdGenerator.generate(length);
	}

}
