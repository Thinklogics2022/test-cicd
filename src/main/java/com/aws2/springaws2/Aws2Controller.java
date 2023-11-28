package com.aws2.springaws2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aws2Controller {
    @GetMapping("/home")
    public String home(){

        return "aws ci/cd";
    }


}
