package com.lotte.dao;

import java.util.List;

import com.lotte.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> boardList() throws Exception;
	public BoardDTO boardDetail(int seq) throws Exception;
	public void boardInsert(BoardDTO dto) throws Exception;
	public void boardDelete(int seq) throws Exception;
	public void boardEdit(BoardDTO dto) throws Exception;
}