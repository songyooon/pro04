package com.lotte.dao;

import java.util.List;

import com.lotte.dto.FreeDTO;

public interface FreeDAO {
	public List<FreeDTO> boardList() throws Exception;
	public FreeDTO boardDetail(int bno) throws Exception;
	public void freeInsert(FreeDTO dto) throws Exception;
	public void freeDelete(int bno) throws Exception;
	public void freeEdit(FreeDTO dto) throws Exception;
	public List<FreeDTO> freeList() throws Exception;
	public FreeDTO freeDetail(int seq) throws Exception;
}