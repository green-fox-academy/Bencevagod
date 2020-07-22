package com.greenfox.reddit_project.Controller;

import com.greenfox.reddit_project.Model.Post;
import com.greenfox.reddit_project.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private PostService postService;

    @Autowired
    public MainController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String mainPage(Model model, @RequestParam (required = false) Integer page) {
        model.addAttribute("posts", postService.get10Posts());
        model.addAttribute("service", postService);
        return "index";
    }

    @GetMapping(value = "/page/{page}")
    public String pageView(Model model, @PathVariable Integer page) {
        model.addAttribute("pagedposts", postService.getPagedPosts(page));
        model.addAttribute("service", postService);
        return "page";
    }

    @GetMapping("/newpost")
    public String newPost() {
        return "newpost";
    }

    @PostMapping("/addnewpost")
    public String addNewPost(@RequestParam String title, @RequestParam String url) {
        postService.savePost(new Post(title, url));
        return "redirect:/";
    }

    @GetMapping("/increment")
    public String increment(@RequestParam Long id) {
        postService.increment(id);
        return "redirect:/";
    }

    @GetMapping("/decrement")
    public String decrement(@RequestParam Long id) {
        postService.decrement(id);
        return "redirect:/";
    }
}
