package com.neckcompany.neck.login.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neckcompany.neck.login.entity.User;
import com.neckcompany.neck.login.service.UserImpl;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	private static final String LOGIN = "login";
	
	@Autowired UserImpl userService;

	@RequestMapping(value="/loginGet", method = RequestMethod.GET)
	public String loginGet(ModelMap model) {
		
		return "login/login";
	}
	
	@ResponseBody
	@RequestMapping(value="/loginPost", method = RequestMethod.POST)
//	public void loginPost(HttpSession session, @RequestBody Map<String, Object> loginParam) {
	public String loginPost(HttpSession session, @RequestBody User user) throws Exception {
		
		String redirectUrl = "";						// 이동할 URL
		User userInfo = userService.login(user);

		if (userInfo != null) {						// 로그인 성공
			session.setAttribute(LOGIN, userInfo);	// 세션에 값세팅
			redirectUrl = "/";
		} else {
			redirectUrl = "/login/loginGet";
		}
		
		return redirectUrl;
	}
}
