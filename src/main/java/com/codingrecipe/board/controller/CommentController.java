package com.codingrecipe.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codingrecipe.board.dto.CommentDTO;
import com.codingrecipe.board.service.CommentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

	private final CommentService commentService;

	@GetMapping("/list/{id}")
	@ResponseBody
	public List<CommentDTO> getComments(@PathVariable("id") Long id) {
		return commentService.getComments(id);
	}

	@PostMapping("/add")
	@ResponseBody
	public String addComment(@RequestBody CommentDTO commentDTO) {
		System.out.println(commentDTO);
		commentService.addComment(commentDTO);
		return "Success";
	}
}
