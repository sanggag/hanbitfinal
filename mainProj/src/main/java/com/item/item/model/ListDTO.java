package com.item.item.model;

import java.util.ArrayList;

import org.apache.ibatis.type.Alias;

@Alias("listDto")
public class ListDTO {
	ArrayList<Menu> list=new ArrayList<Menu>();

	public ArrayList<Menu> getList() {
		return list;
	}

	public void setList(ArrayList<Menu> list) {
		this.list = list;
	}
	
	
}
