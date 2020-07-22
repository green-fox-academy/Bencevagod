package com.greenfox.frontend.Controller;

import com.greenfox.frontend.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private MainService service;

    @Autowired
    public MainController(MainService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }


}
