package com.item.item.model;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service
public class TempService {
	@Resource
	SqlSessionTemplate template;
	
	
	
	@Resource
	SubControllerService subCon;
	
	public void getData(TempData data,HttpServletRequest request){
		subCon.init();
		subCon.map.get(data.top).execute(data);
		
		data.topList=template.selectList("db.listSch","top");
		data.bottomList=template.selectList("db.listSch2","bottom");
		
		/*System.out.println(((Menu)(data.topList).get(0)).cate);
		System.out.println(((Menu)(data.topList).get(1)).val);
		System.out.println(((Menu)(data.topList).get(2)).val);
		System.out.println(((Menu)(data.topList).get(3)).val);*/
		//data.subList=dao.menuList(data.top);
		//data.bottomList=dao.menuList("bottom");
		
		
	}
}
