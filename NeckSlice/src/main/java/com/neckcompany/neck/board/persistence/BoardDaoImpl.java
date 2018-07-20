package com.neckcompany.neck.board.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neckcompany.neck.board.domain.Board;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired private SqlSession sqlSession;
	private static final String namespace = "com.neckcompany.neck.board.persistence.BoardDao";
	
	@Override
	public String selectNowTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectNowTime");
	}

	@Override
	public List<Board> selectBoardList() {
		return sqlSession.selectList(namespace + ".selectBoardList");
	}

	@Override
	public void insertBoard(Board board) {
		sqlSession.insert(namespace + ".insertBoard", board);
	}

}
