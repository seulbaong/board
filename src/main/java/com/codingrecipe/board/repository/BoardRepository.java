package com.codingrecipe.board.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.codingrecipe.board.dto.BoardDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

	private final SqlSessionTemplate sql;

	public void save(BoardDTO boardDTO) {
		//Board 는 mapper 의 namespace
		//save 는 mapper 의 insert id 를 의미함
		//<mapper namespace="Board"><insert id="save" parameterType="board">
		sql.insert("Board.save", boardDTO);
	}

	public List<BoardDTO> findAll() {
		return sql.selectList("Board.findAll");
	}

	public void updateHits(Long id) {
		sql.update("Board.updateHits", id);
	}

	public BoardDTO findById(Long id) {
		return sql.selectOne("Board.findById", id);
	}

	public void update(BoardDTO boardDTO) {
		sql.update("Board.update", boardDTO);
	}

	public void delete(Long id) {
		sql.delete("Board.delete", id);
	}
}
