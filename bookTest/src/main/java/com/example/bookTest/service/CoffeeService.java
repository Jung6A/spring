package com.example.bookTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookTest.DAO.CoffeeDAO;
import com.example.bookTest.DTO.CoffeeDTO;

@Service
public class CoffeeService {
	@Autowired
	private final CoffeeDAO coffeedao;
	
	public CoffeeService(CoffeeDAO coffeedao) {
		this.coffeedao=coffeedao;
	}
	
	//커피 정보 저장
	public void coffeeSave(CoffeeDTO coffeedto) {
		if(coffeedto!=null) {
			coffeedao.insert(coffeedto);
		}
	}
	
	public List<CoffeeDTO> selectAll() {
		return coffeedao.select();
	}
	
	public CoffeeDTO getCoffee(int id) {
		if(id!=0) {
			return coffeedao.findId(id);
		}
		return null;
	}
	
	public void remove(int cid) {
		coffeedao.delete(cid);
	}

	public void update(CoffeeDTO coffeedto) {
		coffeedao.update(coffeedto);
		
	}
}
