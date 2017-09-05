package com.qingshixun.action;

import com.opensymphony.xwork2.ActionSupport;
import com.qingshixun.entity.User;
import com.qingshixun.service.IUserService;
import com.qingshixun.service.impl.UserServiceImpl;

public class RegisterAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private String message;
	private IUserService service=new UserServiceImpl();
	public String register() throws Exception {
		
		return SUCCESS;
	}
	public String registerResult() throws Exception{
		User u=service.findByNameUser(user.getUsername()).get(0);
		if(u==null){
			if (service.registerUser(user)) {
				return SUCCESS;
			} else {
				return ERROR;
			}
		}else{
			message="�û��Ѵ���!������ע�ᣡ";
			System.out.println("�û��Ѵ���!������ע�ᣡ");
			return ERROR;
		}
		
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
