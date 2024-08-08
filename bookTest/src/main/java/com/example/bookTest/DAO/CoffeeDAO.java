package com.example.bookTest.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.DTO.CoffeeDTO;

@Repository
public class CoffeeDAO {
private final JdbcTemplate jt;
	
	@Autowired
	public CoffeeDAO(JdbcTemplate jdbc) {
		this.jt=jdbc;
	}
	
	public List<CoffeeDTO> select(){
		String sql="select * from coffee";
		
		List<CoffeeDTO> list=jt.query(sql,new CoffeeDTORowMapper());
		
		return list;
	}
	
	public void insert(CoffeeDTO coffeedto) { //도서정보 데이터베이스에 저장
		String sql="insert into coffee(item_name, price, decaffein) values(?,?,?)";
		
		jt.update(sql, coffeedto.getItemName(), coffeedto.getPrice(), coffeedto.isDecaffein());
	}
	
	public class CoffeeDTORowMapper implements RowMapper<CoffeeDTO> {

		@Override
		public CoffeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			CoffeeDTO coffeedto=new CoffeeDTO();
			
			coffeedto.setItemName(rs.getString("item_name"));
			coffeedto.setPrice(rs.getInt("price"));
			coffeedto.setDecaffein(rs.getBoolean("decaffein"));
			coffeedto.setCoffeeId(rs.getInt("coffee_id"));
			
			return coffeedto;
		}
		
	}
}
