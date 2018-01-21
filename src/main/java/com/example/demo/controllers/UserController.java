package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Page;
import com.example.demo.service.PageService;
//import com.example.demo.service.UserService;
import com.example.demo.util.ResponseObject;

@RestController
@RequestMapping("api/v1/page")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private PageService pageServices;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseObject getAllPage() {
		return pageServices.getAllPage();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{pageId}")
	public ResponseObject getPageById(@PathVariable long pageId) {
		return pageServices.getPageById(pageId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseObject createAdmin(@RequestBody String  page) {
		return pageServices.createPage(page);
	}
}
