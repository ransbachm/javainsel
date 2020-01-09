package com.insel.chapter21;

import javax.xml.bind.annotation.XmlRootElement;

/*  
 * This is a class to be translated to xml
 */

@XmlRootElement
public class User {
	
	private String name;
	private int age;
	// note: this will be left null and theirfore not be in the final xml file
	private Integer wealth;
	
	public Integer getWealth() {
		return wealth;
	}
	public void setWealth(Integer wealth) {
		this.wealth = wealth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
