package com.ephec.sgbd.controller;

import com.ephec.sgbd.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class AdminController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {

		return "login";
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {

		return "test";
	}
	/*
	@RequestMapping(value="/login", method=RequestMethod.POST,params = {"username", "password"})
	public String getForm(WebRequest request,Model model,@RequestParam(value = "username") String username,@RequestParam(value = "password") String password) {

		Admin admin = new Admin();
		admin.setLogin(username);
		admin.setPassword(password);
		if((admin.isUser())){
			
			//connexion reuissie
			//model.addAttribute(username);
			request.setAttribute("admin", admin, WebRequest.SCOPE_SESSION);
			return "redirect:/tb";
		}else {
			// echec de connexion
			String error = "true";
			model.addAttribute("error",error);
			return "login";
			
		}
		
	}
	
	@RequestMapping(value="/tb", method=RequestMethod.GET)
	public String Tableaubord(WebRequest request) {
		
		if(request.getAttribute("admin", WebRequest.SCOPE_SESSION)==null) {
			return "login";
		}
		
		Admin admin = (Admin)request.getAttribute("admin", WebRequest.SCOPE_SESSION);
		System.out.println("Bienvenue sur mon site web"+ admin.getLogin());
		return "tb";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String Logout(WebRequest request) {
		request.removeAttribute("admin", WebRequest.SCOPE_SESSION);
		return "redirect:/login";
	}


	// == messages ==

	// model attribute
	@ModelAttribute("welcomeMessage")
	public String welcomeMessage(){

		//log.info("welcomeMessage() called ");
		return "BIENVENUE SUR FIFAMANAGER";
	}

	@ModelAttribute("welcomeMessage")
	public String loginErrorMessage(){

		//log.info("welcomeMessage() called ");
		return "login ou mot de passe éronné";
	}


	 */

}
