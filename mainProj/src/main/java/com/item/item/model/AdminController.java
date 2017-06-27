package com.item.item.model;

import org.springframework.stereotype.Service;

@Service
public class AdminController implements SubController{

	@Override
	public Object execute(TempData data) {
		// TODO Auto-generated method stub
		switch(data.service){
		case "black":
			
			break;
		
		
		}
		return data.mainData;
	}

}
