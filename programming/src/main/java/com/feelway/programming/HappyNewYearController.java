package com.feelway.programming;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sendMessage.com")
public class HappyNewYearController {
    @PostMapping("/message")
    public ResponseEntity postHappyNewYear(@RequestBody HappyNewYearPostDto happyNewYearPostDto){
        String msg = "";
        if (happyNewYearPostDto.getRelation().equals("friend") ){
            msg = happyNewYearPostDto.getName() + "아 잘지내지? 다음에 볼때까지 건강해";
        }
        else if (happyNewYearPostDto.getRelation().equals("family")){
            msg = "사랑합니다. 항상 건강하세요";
        }
        else if (happyNewYearPostDto.getRelation().equals("etc")){
            msg = happyNewYearPostDto.getName() + "님 올 한해에는 하시는 일 모두 건승하시고, 건강하세요";
        }
        if (happyNewYearPostDto.getBirth().equals("1.10")){
            msg = msg + " 생일 축하합니다";
        }
        happyNewYearPostDto.setMsg(msg);
        Map<String, String> response = new HashMap<>();
        response.put("tel", happyNewYearPostDto.getTel());
        response.put("msg", happyNewYearPostDto.getMsg());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
