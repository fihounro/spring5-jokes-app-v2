package co.luthercorp.ronyjokeapp.controller;

import co.luthercorp.ronyjokeapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getRandomJoke(Model model){

        model.addAttribute("joke", jokeService.randomJoke());

        return "jokes/show";
    }
}
