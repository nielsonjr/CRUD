package app.controller;

import java.io.IOException;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import app.dao.UserDAO;

@RestController
@RequestMapping("/user")
public class UsersController {

	@Autowired
	private UserDAO uDAO;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list() throws ServletException, IOException{
		System.out.println("oi");
		ModelAndView modelAndView = new ModelAndView("/list/listAllUsers.jsp");
		modelAndView.addObject("usuarios", uDAO.findAll());
		return modelAndView;
	}

}
