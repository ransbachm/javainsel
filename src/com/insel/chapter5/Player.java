package com.insel.chapter5;

class Player {
	
	private String name;
	private String item;
	
	public void setName(String name) {
		if(name != null && !name.trim().isEmpty()) {
			this.name = name;
		}
	}
	
	public void setItem(String item) {
		if(item != null && !item.trim().isEmpty()) {
			this.item = item;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getItem() {
		return this.item;
	}
	

}
