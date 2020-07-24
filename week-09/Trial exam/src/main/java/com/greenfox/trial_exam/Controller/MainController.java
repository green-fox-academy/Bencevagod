package com.greenfox.trial_exam.Controller;

import com.greenfox.trial_exam.Model.Alias;
import com.greenfox.trial_exam.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private MainService service;

    @Autowired
    public MainController(MainService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String mainPage(Model model, @RequestParam (required = false) boolean isSaved) {
        model.addAttribute("isSaved", isSaved);
        model.addAttribute("alias", service.findLastAlias());
        return "index";
    }

    @PostMapping("/save-link")
    public String save(@RequestParam (name = "url") String url, @RequestParam (name = "alias") String alias) {
        service.addAlias(url, alias);
        return "redirect:/?isSaved="+service.isAliasNotPresentInDatabase(alias);
    }

//    @GetMapping("/a/{alias}")
//    public String hit(@PathVariable String alias) {
//
//    }
}
