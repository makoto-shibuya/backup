package com.internousdev.webproj3.action;

import com.internousdev.webproj3.dao.HelloStrutsDAO;
import com.internousdev.webproj3.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;




public class HelloStrutsAction extends ActionSupport {

	private String result;

	public String execute(){
		String ret=ERROR;
		HelloStrutsDAO dao= new HelloStrutsDAO();
		HelloStrutsDTO dto= new HelloStrutsDTO();
		dto=dao.select();

		System.out.println(dto.getResult());

		result=dto.getResult();

	}

}
