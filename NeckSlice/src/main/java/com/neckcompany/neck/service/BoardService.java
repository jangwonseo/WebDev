package com.neckcompany.neck.service;

import java.util.List;

import com.neckcompany.neck.domain.Board;

public interface BoardService {
	
	public String nowTime();
	
	public List<Board> getBoardList();
	
	public void saveBoard(Board board);

}
