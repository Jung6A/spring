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
	
	//도서 상세 정보 가져오기- 1권에 대해서만(book_id로 조회)
	//book_id 컬럼이 중복 데이터를 가질 수 없는 유일값이기 때문에
	public BookDTO findId(int id) {
		String sql="select * from book where book_id=?";
		
		//BookDTO data=jt.queryForObject(쿼리문, mapper, ?에 넣을 값);
		BookDTO data=jt.queryForObject(sql, 
				new RowMapper<BookDTO>() {
					//익명 클래스
					@Override
					public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
						BookDTO dto=new BookDTO();
						
						dto.setBookAuthor(rs.getString("book_author"));
						dto.setBookPrice(rs.getInt("book_price"));
						dto.setBookPage(rs.getInt("book_page"));
						dto.setBookTitle(rs.getString("book_title"));
						dto.setPublisher(rs.getString("publisher"));
						dto.setBookId(rs.getInt("book_id"));
						
						return dto;
					}
				}
					, id);
		return data;
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
