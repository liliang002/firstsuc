package com.liliang.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liliang.entity.TFuncdict;
import com.liliang.services.LoginService;

@Controller
@RequestMapping("/log/")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	protected Logger log = Logger.getLogger(getClass());  
	
	@RequestMapping("test.htmls")
	public String test(HttpServletRequest request){
		System.out.println("______________________________");
		return "test";
	}
	 
	@RequestMapping("loginAuth.htmls")
	public String loginAuth(HttpServletRequest request){
		String userName = request.getParameter("username").toString();
		String passWord = request.getParameter("password").toString();
		if(loginService.loginAuth(userName, passWord)==1){
//			return "main";
			return "redirect:logOn.htmls";
		}else{
			request.setAttribute("tipMessage", "反正是有错，重试试吧！！");
			return "login";
		}
//		return "1";
	}
	
	@RequestMapping("login.htmls")
	public String loginWelcome(HttpServletRequest request){
		
		return "login";
	}
	
	@RequestMapping("logOn.htmls")
	public String logOn(HttpServletRequest request){
		HttpSession session=request.getSession(); 
		ModelAndView mov = new ModelAndView();
		
		final Set<TFuncdict> menus = loginService.getRootMenu(0);

		TFuncdict rootMenus = new TFuncdict();
		final Map<TFuncdict, List<TFuncdict>> menuMap = new LinkedHashMap<TFuncdict, List<TFuncdict>>();

		// step one: find out root menus
		for (final TFuncdict menu : menus) {
			log.debug("test00000000000000000000000000000000000000000000000000000000");
				rootMenus=menu;
			
			Set<TFuncdict> child = loginService.getRootMenu(menu.getId());
			final List<TFuncdict> childMenus = new ArrayList<TFuncdict>(child);  
			 
			System.out.println(rootMenus.getName());
//			Collections.sort(childMenus, new MenuSortor());
			menuMap.put(rootMenus, childMenus);
//			System.out.println(((TFuncdict) menuMap.get("rootMenus")).getName());
		}
//		((Map) session).put("menuMap", menuMap);
		session.setAttribute("menuMap", menuMap);
		return "main";
	}
	
	@RequestMapping("logRegister.htmls")
	public void logRegister(HttpServletRequest request,HttpServletResponse response) throws IOException{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String username = request.getParameter("user").toString();
		String passWord = request.getParameter("passwd").toString();
		System.out.println("username="+username);
		String result1 = loginService.logRegister(username, passWord);
		resultMap.put("result", result1);
		JSON result= JSONObject.fromObject(resultMap);
		log.debug("result========"+result);
//		ModelAndView view = new ModelAndView();
//		view.addObject("result",result);
		response.setContentType("text/html; charset=UTF-8");
        response.setHeader("Cache-Control", "no-cache");
        PrintWriter out = response.getWriter();
		out.println(result);
//		out.println("result.data=eval(" + result + ")");
//		out.println("core.ajax.receivePacket(response);");
		out.flush();
		out.close(); 
//		return result;
	}

}
