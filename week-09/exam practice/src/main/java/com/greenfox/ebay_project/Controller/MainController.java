package com.greenfox.ebay_project.Controller;

import com.greenfox.ebay_project.Service.ErtekelesService;
import com.greenfox.ebay_project.Service.HirdetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private ErtekelesService ertekelesService;
    private HirdetesService hirdetesService;

    @Autowired
    public MainController(ErtekelesService ertekelesService, HirdetesService hirdetesService) {
        this.ertekelesService = ertekelesService;
        this.hirdetesService = hirdetesService;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("termekek", hirdetesService.listMostPopular());
        return "index";
    }

    @PostMapping("/search")
    public String searchItems(@RequestParam (name = "search") String search, Model model) {
        model.addAttribute("termekek", hirdetesService.search(search));
        return "index";
    }

}
