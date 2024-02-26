package com.isuru.apim;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @PostMapping("/hello")
    public ResponseEntity<String> hello(@RequestBody HelloDto helloDto){
        System.out.println("Received : " + helloDto.getN());
        return ResponseEntity.ok("Received : " + helloDto.getN());
    }

}