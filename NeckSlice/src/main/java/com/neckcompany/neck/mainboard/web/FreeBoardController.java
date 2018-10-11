package com.neckcompany.neck.mainboard.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neckcompany.neck.mainboard.entity.FreeBoard;
import com.neckcompany.neck.mainboard.service.Impl.FreeBoardImpl;

@Controller
@RequestMapping(value="/mainboard")
public class FreeBoardController {

	@Autowired private FreeBoardImpl freeBoardService;
	
	@RequestMapping(value="/listBoard", method = RequestMethod.GET)
	public String listBoard(ModelMap model) {
		
		List<FreeBoard> freeBoardList = freeBoardService.getAllFreeBoardList();
		model.addAttribute("freeBoardList", freeBoardList);
		
		List<FreeBoard> hitBoardOverList = freeBoardService.getHittedOver(5);
		model.addAttribute("hitBoardOverList", hitBoardOverList);
		
		List<FreeBoard> hitBoardUnderList = freeBoardService.getHittedUnder(5);
		model.addAttribute("hitBoardUnderList", hitBoardUnderList);
		
		List<FreeBoard> freeBoardListHitOver3 = freeBoardService.getHittedOver3();
		model.addAttribute("freeBoardListHitOver3", freeBoardListHitOver3);
		
		return "mainboard/listBoard";
	}
}
