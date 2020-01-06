package com.insel.chapter21;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://progamernothd.host")
public class UserDatabase {
	private List<User> users = new ArrayList<>();
	
	@XmlElement(name = "user") 
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
