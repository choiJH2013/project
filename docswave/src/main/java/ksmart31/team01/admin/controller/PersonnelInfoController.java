package ksmart31.team01.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart31.team01.admin.service.PersonnelInfoService;

@Controller
public class PersonnelInfoController {
	
	@Autowired private PersonnelInfoService personnelInfoService;
	
	@GetMapping("/")
	public String PersonnelInfo() {
		
		
		return "personnelSetUpView";
	}
}
