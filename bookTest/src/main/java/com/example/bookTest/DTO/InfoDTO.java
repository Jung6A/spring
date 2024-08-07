package com.example.bookTest.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InfoDTO { //home.jsp의 form 데이터 받기
	private String uName;
	private String uBirth;
}
