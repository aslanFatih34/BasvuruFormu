package com.userfront.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.userfront.domain.User;

import com.userfront.service.UserService;

@Controller
public class HomeController {
	
	//servisi autwired anotasyonuyla kullanıyoruz.
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/")  //default olarak uygulama indexi açıcak.
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")   // index sayfası mappingi
    public String index() {
        return "index";
    }
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)  //signup sayfası 
    public String signup(Model model) {
        User user = new User();            // yeni bir user olusturacagız.

        model.addAttribute("user", user);  // user bilgilerini kaydedeceğiz.

        return "signup";
    }
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)   // post ta da bilgileri kaydedeceğiz.
    public String signupPost(@ModelAttribute("user") User user,  Model model) {
         userService.saveUser(user);

            return "redirect:/";
        }
    }
	


