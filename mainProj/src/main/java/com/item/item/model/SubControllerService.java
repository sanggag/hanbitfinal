package com.item.item.model;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class SubControllerService {
	HashMap<String, SubController> map=new HashMap();
	
	@Resource
	CenterController center;
	
	
	public void init(){
		map.put("center", center);
	}
}
