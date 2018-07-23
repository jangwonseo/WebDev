package com.neckcompany.neck.mainboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neckcompany.neck.mainboard.entity.FreeBoard;
import com.neckcompany.neck.mainboard.repository.FreeBoardRepository;

@Service
@Transactional
public class FreeBoardService {

	@Autowired FreeBoardRepository freeBoardRepository;
	
	public List<FreeBoard> getAllFreeBoardList() {
		return freeBoardRepository.findAll();
	}
}
