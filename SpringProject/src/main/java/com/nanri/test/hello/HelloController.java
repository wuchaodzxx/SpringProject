package com.nanri.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nanri.utils.security.VerifyCodeUtil;

@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public @ResponseBody String test() {
    	
        return "hello, world! This com from spring!";
    }

}