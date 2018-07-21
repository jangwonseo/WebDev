package com.neckcompany.neck.board.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neckcompany.neck.board.domain.Board;
import com.neckcompany.neck.board.service.BoardService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired BoardService boardService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
        
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date); 
		model.addAttribute("serverTime", formattedDate );
		
		// select all
		List<Board> boardList = boardService.getBoardList();
		boardList.stream().forEach(b-> {
			System.out.println("@@" + b.getTitle());
		});
		
		// insert
		Board board = new Board();
		board.setTitle("오만과편견");
		board.setContent("중세시대이야기입니다.");
		board.setAuthor("서장원");
		boardService.saveBoard(board);
		
		// now
		System.out.println("now ServiceTime : " + boardService.nowTime());
		
		return "home";
	}
}
