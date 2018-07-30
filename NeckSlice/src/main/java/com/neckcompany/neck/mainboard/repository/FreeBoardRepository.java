package com.neckcompany.neck.mainboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.neckcompany.neck.mainboard.entity.FreeBoard;
import com.neckcompany.neck.mainboard.repository.impl.FreeBoardRepositoryCustom;

public interface FreeBoardRepository extends JpaRepository<FreeBoard, Long>, FreeBoardRepositoryCustom {
	
	/**
	 * 일정 조회수 이상의 게시글 리스 조회
	 * 
	 * @param hit
	 * @return
	 */
	public List<FreeBoard> findByHitGreaterThan(@Param(value="hit") Integer hit);
	
	@Query("select fb from FreeBoard fb where fb.hit <= :hit")
	public List<FreeBoard> findByHitUnder(@Param(value="hit") Integer hit);
}
