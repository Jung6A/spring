package com.example.bookTest.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.DTO.BookDTO;

@Repository
public class BookDAO {
	private final JdbcTemplate jt;
	
	@Autowired
	public BookDAO(JdbcTemplate jdbctemplate) {
		this.jt=jdbctemplate;
	}
	
	//book 테이블 전체 데이터 가져오기- 첫 화면에 목록으로 출력
	public List<BookDTO> select(){
		String sql="select * from book";
		
		List<BookDTO> list=jt.query(sql,new BookDTORowMapper());
		
		return list;
	}
	
	public void insert(BookDTO bookdto) { //도서정보 데이터베이스에 저장
		String sql="insert into book(book_title, book_author, book_price, book_page, publisher) values(?,?,?,?,?)";
		
		jt.update(sql, bookdto.getBookTitle(), bookdto.getBookAuthor(), bookdto.getBookPrice(), bookdto.getBookPage(), bookdto.getPublisher());
	}
	
	public class BookDTORowMapper implements RowMapper<BookDTO> {

		@Override
		public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			BookDTO bookdto=new BookDTO();
			
			bookdto.setBookAuthor(rs.getString("book_author"));
			bookdto.setBookPrice(rs.getInt("book_price"));
			bookdto.setBookPage(rs.getInt("book_page"));
			bookdto.setBookTitle(rs.getString("book_title"));
			bookdto.setPublisher(rs.getString("publisher"));
			bookdto.setBookId(rs.getInt("book_id"));
			
			return bookdto;
		}
		
	}
}
