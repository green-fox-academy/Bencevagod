package com.greenfox.ebay_project.Controller;

import com.greenfox.ebay_project.Model.Ertekeles;
import com.greenfox.ebay_project.Model.Hirdetes;
import com.greenfox.ebay_project.Service.ErtekelesService;
import com.greenfox.ebay_project.Service.HirdetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

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
        List<Hirdetes> hirdetesk = hirdetesService.findAllHirdetes();
        model.addAttribute("termekek", hirdetesk);
        return "index";
    }

    @PostMapping("/search")
    public String searchItems(@RequestParam (name = "search") String search, Model model) {
        model.addAttribute("termekek", hirdetesService.search(search));
        return "index";
    }

    @GetMapping("/hirdetes/{termek_id}")
    public String showReviews(@PathVariable("termek_id") Long id, Model model) {
        model.addAttribute("hirdetes", hirdetesService.findHirdetesById(id));
        model.addAttribute("ertekelesek", ertekelesService.findErtekelesekByHirdetesId(hirdetesService.findHirdetesById(id).getId()));
        return "termekPage";
    }

    @PostMapping("/ertekeles/{termek_id}")
    public String newReview(@PathVariable("termek_id") Long hirdetesId, @RequestParam(value = "name") String name, @RequestParam(value = "stars") Integer stars, @RequestParam(value = "content") String content, Model model) {
        ertekelesService.saveReview(new Ertekeles(name, content, stars, hirdetesService.findHirdetesById(hirdetesId)));
        return "redirect:/hirdetes/"+hirdetesId;
    }
}
