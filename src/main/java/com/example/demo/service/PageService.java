package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Page;
import com.example.demo.util.ResponseObject;


@Service
public interface PageService {
	
	public ResponseObject getAllPage();
	
	public ResponseObject getPageById(long id);
	
	public ResponseObject createPage(String page);
	
}
