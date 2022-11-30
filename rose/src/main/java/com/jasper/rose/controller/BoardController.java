package com.jasper.rose.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasper.rose.domain.BoardVO;

import java.util.List;
import java.util.ArrayList;

@RestController
public class BoardController {
    public BoardController() {
        System.out.println("=====> BoardController 생성");
    }

    @GetMapping("/home")
    public String hello(String name) {
        return "당신의 이름은 무엇입니까? " + name + "입니다!";
    }

    @GetMapping("/getBoard")
    public BoardVO getBoard() {
        BoardVO board = new BoardVO();
        board.setSeq(1);
        board.setTitle("나는 누구일까요?");
        board.setWriter("톰행크스");
        board.setContent("배우입니다...ㅎㅎㅎㅎ....매우 훌륭한...!");
        board.setCreateDate(new Date());
        board.setCnt(0);
        return board;
    }

    @GetMapping("/getBoardList")
    public List<BoardVO> getBoardList() {
        List<BoardVO> boardList = new ArrayList<BoardVO>();
        for (int i = 1; i <= 10; i++) {
            BoardVO board = new BoardVO();
            board.setSeq(i);
            board.setTitle("제목" + i);
            board.setWriter("테스터");
            board.setContent(i+"번 내용입니다.");
            board.setCreateDate(new Date());
            board.setCnt(0);
            boardList.add(board);
        }
        return boardList;
    }

}
