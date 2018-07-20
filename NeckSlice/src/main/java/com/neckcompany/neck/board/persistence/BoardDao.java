package com.neckcompany.neck.board.persistence;

import java.util.List;

import com.neckcompany.neck.board.domain.Board;

public interface BoardDao {
	
	public String selectNowTime();
	
	public List<Board> selectBoardList();
	
	public void insertBoard(Board board);
}
