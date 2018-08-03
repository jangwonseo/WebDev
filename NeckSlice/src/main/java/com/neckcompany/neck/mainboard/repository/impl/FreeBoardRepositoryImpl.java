package com.neckcompany.neck.mainboard.repository.impl;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.neckcompany.neck.mainboard.entity.FreeBoard;
import com.neckcompany.neck.mainboard.entity.QComment;
import com.neckcompany.neck.mainboard.entity.QFreeBoard;
import com.querydsl.jpa.JPQLQuery;

public class FreeBoardRepositoryImpl extends QuerydslRepositorySupport implements FreeBoardRepositoryCustom {

	public FreeBoardRepositoryImpl() {
		super(FreeBoard.class);
	}

	@Override
	public List<FreeBoard> findFreeBoardListCustom() {
		
		QFreeBoard freeBoard = QFreeBoard.freeBoard;
		QComment comment = QComment.comment;
		
		JPQLQuery<FreeBoard> query = from(freeBoard);
		List<FreeBoard> freeBoardList = query.join(freeBoard.commentList, comment).fetch();
		
		return freeBoardList;
	}

}
