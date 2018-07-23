package com.neckcompany.neck.mainboard.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neckcompany.neck.mainboard.entity.FreeBoard;
import com.neckcompany.neck.mainboard.service.FreeBoardService;

@Controller
@RequestMapping(value="/mainboard")
public class FreeBoardController {

	@Autowired private FreeBoardService freeBoardService;
	
	@RequestMapping(value="/listBoard.do", method = RequestMethod.GET)
	public String freeBoardList(ModelMap model) {
		
		List<FreeBoard> freeBoardList = freeBoardService.getAllFreeBoardList();
		model.addAttribute("freeBoardList", freeBoardList);
		
		
		return "mainboard/listBoard";
	}
}
