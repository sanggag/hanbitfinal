package com.item.item;




import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.item.item.model.TempData;
import com.item.item.model.TempService;



/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("{aaa}/{bbb}/{ccc}")
public class MainController {
	@Resource
	TempService service;
	
	@ModelAttribute
	public TempData data(@PathVariable String aaa, @PathVariable String bbb, @PathVariable String ccc,
			HttpServletRequest request) {
		System.out.println("거치냐?");
		TempData data = new TempData();
		System.out.println(aaa+bbb+ccc);
		data.setTop(aaa);
		data.setSub(bbb);
		data.setService(ccc);
		data.setMainView(ccc);
		service.getData(data, request);
		return data;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping()
	public String home() {
		
		
		return "company/template";
	}
	
}
