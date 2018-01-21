package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Page;

@Repository
public interface PageDao extends CrudRepository<Page, Long>{
	
	public List<Page> findAll();
	
	public Page findByPageId(long pageId);

}
