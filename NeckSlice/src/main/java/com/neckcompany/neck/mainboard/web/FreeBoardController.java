package com.neckcompany.neck.mainboard.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neckcompany.neck.mainboard.entity.FreeBoard;
import com.neckcompany.neck.mainboard.repository.FreeBoardRepository;

@Controller
@RequestMapping(value="/mainboard")
public class FreeBoardController {

	@Autowired private FreeBoardRepository freeBoardRepository;
//	@Autowired private CommentRepository commentRepository;
	
	@RequestMapping(value="/freeBoardList.do", method = RequestMethod.GET)
	public String freeBoardList(ModelMap model) {
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		List<FreeBoard> freeBoardList = freeBoardRepository.findAll();
		freeBoardList.stream().forEach(f -> {
			System.out.println(f.getTitle());
		});
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return "mainboard/mainboard";
		
	}
}
