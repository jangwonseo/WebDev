package com.neckcompany.neck.board.service;

import java.util.List;

import com.neckcompany.neck.board.domain.Board;

public interface BoardService {
	
	public String nowTime();
	
	public List<Board> getBoardList();
	
	public void saveBoard(Board board);

}
