package com.pratyush;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pratyush.service.AddService;


@Controller
public class AddController {

@RequestMapping("/add")	
public ModelAndView add(@RequestParam("t1") int i1,@RequestParam("t1") int i2, HttpServletRequest request,HttpServletResponse response) {
	AddService as =new AddService();
	
//	int i = Integer.parseInt(request.getParameter("t1"));
//	int j = Integer.parseInt(request.getParameter("t2"));
	int k = as.add(i1,i2); 
	
	ModelAndView mv = new ModelAndView();
	//mv.setViewName("display.jsp");
	mv.setViewName("display");
	mv.addObject("result",k);
	
	return mv;
	
}
}
