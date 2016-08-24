package com.liliang.controller.users;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liliang.entity.TUsers;
import com.liliang.services.user.UsersService;

@Controller
@RequestMapping("/users/")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	protected Logger log = Logger.getLogger(getClass());  
	
//	@RequestMapping("initUsers.htmls")
//	public String initUsers(HttpServletRequest request,Model model){
//		HttpSession session=request.getSession(); 
//		System.out.println("____________initUsers__________________");
//		ModelAndView mov = new ModelAndView();
//		List<TUsers> usersInfo = usersService.getUsersInfo();
////		mov.setViewName(viewName);
//		mov.addObject("usersInfo", usersInfo);
//		model.addAttribute("usersInfo", usersInfo);
////		session.setAttribute("usersInfo", usersInfo);
//		System.out.println("____________initUsers2__________________");
//		return "/users/user_main";
//	}
	
	@RequestMapping("initUsers.htmls")
	public ModelAndView initUsers(HttpServletRequest request){
		System.out.println("____________initUsers__________________");
		ModelAndView mov = new ModelAndView();
		List<TUsers> usersInfo = usersService.getUsersInfo();
		mov.setViewName("/users/user_main");
		mov.addObject("usersInfo", usersInfo);
		System.out.println("____________initUsers2__________________");
		return mov;
//		ModelMap modelMap=new ModelMap();
//		modelMap.addAttribute("usersInfo", usersInfo); 
//		return new ModelAndView("/users/user_main",modelMap);
	}

//	@RequestMapping("initUsers.htmls")
//	public String initUsers(HttpServletRequest request,Model model){
//        List<TUsers> usersInfo = usersService.getUsersInfo(); 
//        model.addAttribute("usersInfo", usersInfo);
//        return "/users/user_main";
//    }
	
}
