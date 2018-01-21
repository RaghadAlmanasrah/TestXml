package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Page implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long pageId;
	
	private String page;
	
	
	public Page(){}
	
	
	
	@Override
	public String toString() {
		String info = String.format("page Info: pageId = %s, page = %s", 
												pageId, page);
		return info;
	}



	public long getPageId() {
		return pageId;
	}



	public void setPageId(long pageId) {
		this.pageId = pageId;
	}



	public String getPage() {
		return page;
	}



	public void setPage(String page) {
		this.page = page;
	}
}