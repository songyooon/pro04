package com.lotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotte.dao.FreeDAO;
import com.lotte.dto.FreeDTO;

@Service
public class FreeServiceImpl implements FreeService {

	@Autowired
	private FreeDAO freeDAO;

	@Override
	public List<FreeDTO> freeList() throws Exception {
		return freeDAO.freeList();
	}

	@Override
	public FreeDTO freeDetail(int seq) throws Exception {
		return freeDAO.freeDetail(seq);
	}

	@Override
	public void freeInsert(FreeDTO dto) throws Exception {
		freeDAO.freeInsert(dto);
	}

	@Override
	public void freeDelete(int seq) throws Exception {
		freeDAO.freeDelete(seq);
	}

	@Override
	public void freeEdit(FreeDTO dto) throws Exception {
		freeDAO.freeEdit(dto);
	}

}
