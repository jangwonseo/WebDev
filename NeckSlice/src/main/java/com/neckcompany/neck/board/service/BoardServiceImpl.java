package com.neckcompany.neck.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neckcompany.neck.board.domain.Board;
import com.neckcompany.neck.board.persistence.BoardDao;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public String nowTime() {
		return boardDao.selectNowTime();
	}

	@Override
	public List<Board> getBoardList() {
		return boardDao.selectBoardList();
	}

	@Override
	public void saveBoard(Board board) {
		boardDao.insertBoard(board);
	}
}
