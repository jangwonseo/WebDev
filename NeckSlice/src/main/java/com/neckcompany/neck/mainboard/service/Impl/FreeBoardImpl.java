package com.neckcompany.neck.mainboard.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neckcompany.neck.mainboard.entity.FreeBoard;
import com.neckcompany.neck.mainboard.repository.FreeBoardRepository;

@Service
@Transactional
public class FreeBoardImpl {

	@Autowired FreeBoardRepository freeBoardRepository;
	
	public List<FreeBoard> getAllFreeBoardList() {
		return freeBoardRepository.findAll();
	}
	
	public List<FreeBoard> getHittedOver(Integer hitCount) {
		return freeBoardRepository.findByHitGreaterThan(hitCount);
	}
	
	public List<FreeBoard> getHittedUnder(Integer hitCount) {
		return freeBoardRepository.findByHitUnder(hitCount);
	}
}
