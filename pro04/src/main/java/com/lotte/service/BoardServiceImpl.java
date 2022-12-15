package com.lotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotte.dao.BoardDAO;
import com.lotte.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDAO.boardList();
	}

	@Override
	public BoardDTO boardDetail(int seq) throws Exception {
		return boardDAO.boardDetail(seq);
	}

	@Override
	public void boardInsert(BoardDTO dto) throws Exception {
		boardDAO.boardInsert(dto);
	}

	@Override
	public void boardDelete(int seq) throws Exception {
		boardDAO.boardDelete(seq);
	}

	@Override
	public void boardEdit(BoardDTO dto) throws Exception {
		boardDAO.boardEdit(dto);
	}

}