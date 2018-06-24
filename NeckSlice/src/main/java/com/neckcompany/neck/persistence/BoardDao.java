package com.neckcompany.neck.persistence;

import java.util.List;

import com.neckcompany.neck.domain.Board;

public interface BoardDao {
	
	public String selectNowTime();
	
	public List<Board> selectBoardList();
	
	public void insertBoard(Board board);
}
