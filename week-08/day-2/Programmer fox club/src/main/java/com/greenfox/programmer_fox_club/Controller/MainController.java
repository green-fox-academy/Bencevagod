package com.greenfox.programmer_fox_club.Controller;

import com.greenfox.programmer_fox_club.Model.Fox;
import com.greenfox.programmer_fox_club.Service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    FoxService foxService;

    public MainController() {
        foxService = new FoxService();
    }

    @GetMapping("/")
    public String showFox(@RequestParam(required = false) String name, Model model) {
        if (foxService.getLoggedInUser() == null) {
            return "redirect:/login";
        }

        Fox fox = foxService.findFoxByName(foxService.getLoggedInUser());
        model.addAttribute("fox", fox);
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @PostMapping("/addnew")
    public String addNewFox(@RequestParam String name) {
        foxService.addNewFox(name);
        foxService.setLoggedInUser(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutritionstore")
    public String nutritionStore(Model model) {
        if (foxService.getLoggedInUser() == null) {
            return "redirect:/login";
        }

        Fox fox = foxService.findFoxByName(foxService.getLoggedInUser());
        model.addAttribute("fox", fox);
        model.addAttribute("foods", foxService.findFoxByName(foxService.getLoggedInUser()).getSortedFoodList());
        model.addAttribute("drinks", foxService.findFoxByName(foxService.getLoggedInUser()).getSortedDrinkList());
        return "nutritionstore";
    }

    @PostMapping("/edit")
    public String editFoodNDrink(@RequestParam(value = "foods") String food, @RequestParam(value = "drinks") String drink) {
        foxService.findFoxByName(foxService.getLoggedInUser()).setFood(food);
        foxService.findFoxByName(foxService.getLoggedInUser()).setDrink(drink);
        return "redirect:/?name="+foxService.getLoggedInUser();
    }

    @GetMapping("/trickcenter")
    public String trickCenter(Model model) {
        if (foxService.getLoggedInUser() == null) {
            return "redirect:/login";
        }

        Fox fox = foxService.findFoxByName(foxService.getLoggedInUser());
        model.addAttribute("fox", fox);
        model.addAttribute("tricks", fox.getLearnableTricks());
        return "tricks";
    }

    @PostMapping("/addtrick")
    public String learnNewTricks(@RequestParam(value = "tricks") String trick) {
        foxService.findFoxByName(foxService.getLoggedInUser()).learnTrick(trick);
        return "redirect:/?name="+foxService.getLoggedInUser();
    }
}
