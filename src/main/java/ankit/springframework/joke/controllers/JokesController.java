package ankit.springframework.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ankit.springframework.joke.services.JokeService;

@Controller
public class JokesController {
	@Autowired
	private JokeService jokeService;

	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({ "/", "" })
	public String getJoke(Model model) {
		model.addAttribute("joke", jokeService.getQuotes());
		return "chucknorris";
	}
}
