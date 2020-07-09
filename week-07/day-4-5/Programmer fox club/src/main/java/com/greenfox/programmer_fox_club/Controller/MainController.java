package com.greenfox.programmer_fox_club.Controller;

import com.greenfox.programmer_fox_club.Model.Drinks;
import com.greenfox.programmer_fox_club.Model.Foods;
import com.greenfox.programmer_fox_club.Model.Fox;
import com.greenfox.programmer_fox_club.Service.FoxService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class MainController {

    FoxService foxService;
    public MainController() {
        foxService = new FoxService();
    }

    @GetMapping("/")
    public String showFox(@RequestParam (required = false) String name, Model model) {
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
        return "redirect:/?name="+ name;
    }

    @GetMapping("/nutritionstore")
    public String nutritionStore(Model model) {
        if (foxService.getLoggedInUser() == null) {
            return "redirect:/login";
        }

        Fox fox = foxService.findFoxByName(foxService.getLoggedInUser());
        model.addAttribute("fox", fox);
        model.addAttribute("foods", Foods.values());
        model.addAttribute("drinks", Drinks.values());
        return "nutritionstore";
    }

    @PostMapping("/edit")
    public String editFoodNDrink(@RequestParam (value = "foods") String food, @RequestParam (value = "drinks") String drink) {
        foxService.findFoxByName(foxService.getLoggedInUser()).setFood(food);
        foxService.findFoxByName(foxService.getLoggedInUser()).setDrink(drink);
        return "redirect:/";
    }

}
