package com.example.demo.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.constatnt.ResponseCode;
import com.example.demo.constatnt.ResponseMessage;
import com.example.demo.constatnt.ResponseStatus;
import com.example.demo.dao.PageDao;
import com.example.demo.entity.Page;
import com.example.demo.service.PageService;
import com.example.demo.util.ResponseObject;
import com.example.demo.util.ResponseObjectAll;
import com.example.demo.util.ResponseObjectCrud;
import com.example.demo.util.ResponseObjectData;



@Service
@Component
public class PageServiceImpl implements PageService{
	
	@Autowired
	private PageDao pageDao;

	@Override
	public ResponseObject getAllPage() {
		ResponseObject response = null;
		List<Page> users = pageDao.findAll();
		response = new ResponseObjectAll<>(ResponseStatus.SUCCESS_RESPONSE_STATUS, ResponseCode.SUCCESS_RESPONSE_CODE, ResponseMessage.SUCCESS_GETTING_MESSAGE, users);
		return response;
	}

	@Override
	public ResponseObject createPage(String page) {
		ResponseObject response = null;
		Page p = new Page();
		p.setPage(page);
		pageDao.save(p);
		response = new ResponseObjectData(ResponseStatus.SUCCESS_RESPONSE_STATUS, ResponseCode.SUCCESS_RESPONSE_CODE, ResponseMessage.SUCCESS_CREATING_MESSAGE, p);
		return response;
	}
	public ResponseObject getPageById(long id){
		ResponseObject response = null;
		Page page =pageDao.findByPageId(id);
		response = new ResponseObjectData(ResponseStatus.SUCCESS_RESPONSE_STATUS, ResponseCode.SUCCESS_RESPONSE_CODE, ResponseMessage.SUCCESS_GETTING_MESSAGE, page);
		return response;
	}
}
