package com.codingrecipe.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingrecipe.board.dto.CommentDTO;
import com.codingrecipe.board.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {

	private final CommentRepository commentRepository;

	public List<CommentDTO> getComments(Long id) {
		return commentRepository.getComments(id);
	}

	public void addComment(CommentDTO commentDTO) {
		commentRepository.addComment(commentDTO);
	}
}
