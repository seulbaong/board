package com.codingrecipe.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingrecipe.board.dto.BoardDTO;
import com.codingrecipe.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;

	public void save(BoardDTO boardDTO) {
		boardRepository.save(boardDTO);
	}

	public List<BoardDTO> findAll() {
		return boardRepository.findAll();
	}

	public void updateHits(Long id) {
		boardRepository.updateHits(id);
	}

	public BoardDTO findById(Long id) {
		return boardRepository.findById(id);
	}

	public void update(BoardDTO boardDTO) {
		boardRepository.update(boardDTO);
	}

	public void delete(Long id) {
		boardRepository.delete(id);
	}
}
