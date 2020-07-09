package com.greenfox.useful_utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class UsefulController {

    private final UsefulService usefulService;

    public UsefulController(UsefulService usefulService) {
        this.usefulService = usefulService;
    }

    @GetMapping("/useful")
    public String showUseful() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", usefulService.randomColor());
        return "colored";
    }

    @PostMapping("/useful/email")
    public String email(@RequestParam (value = "email") String email, Model model) {
        List<String> valid = usefulService.validate(email);
        model.addAttribute("validate", valid.get(0));
        model.addAttribute("color", valid.get(1));
        return "/useful/validate";
    }
}
