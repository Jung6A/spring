package com.example.bookTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookTest.DAO.BookDAO;
import com.example.bookTest.DTO.BookDTO;

@Service
public class BookService {
	private final BookDAO bookdao;
	
	@Autowired
	public BookService(BookDAO bookdao) {
		this.bookdao=bookdao;
	}
	
	//도서 정보 저장
	public void bookSave(BookDTO bookdto) {
		if(bookdto!=null) {
			//도서 코드가 이미 데이터베이스에 저장되어있는지 확인 후 저장
			bookdao.insert(bookdto); //DAO 클래스의 insert 메서드 실행해서 저장
		}
	}
	
	//도서 정보 데이터베이스에서 가져와 List에 저장된 것을 받아 control에 넘겨주기
	public List<BookDTO> selectAll() {
		return bookdao.select();
	}
}
