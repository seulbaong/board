package com.codingrecipe.board.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.codingrecipe.board.dto.CommentDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

	private final SqlSessionTemplate sql;

	public List<CommentDTO> getComments(Long id) {
		return sql.selectList("Comment.getComments", id);
	}

	public void addComment(CommentDTO commentDTO) {
		sql.insert("Comment.addComment", commentDTO);
	}
}
