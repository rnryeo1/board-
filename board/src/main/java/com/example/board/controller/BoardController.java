package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//http 요청 받아서 응답하는 컴포넌트 스프링 부트가 자동으로 bean으로 생성한다.
@Controller
public class BoardController {
    //게시물 목록을 보여준다.
    //컨트롤러의 메소드가 리턴하는 문자열은 템플릿 이름이다.
    //http://localhost:8080/ -----> "list" 라는 이름의 템플릿을 사용하여 화면에 출력.
    //list 를 리턴한다는 것은
    //classpath:/templates/list.html

    @GetMapping("/")
    public  String list(){
        return "list";
    }


}
