package com.learn.springbootlearn.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HsController {

    @RequestMapping("/hs")
    public String hs()
    {
        return "ok";
    }
}
