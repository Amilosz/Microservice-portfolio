package com.officialJokeAPI.joke.official.api.resources;

import com.officialJokeAPI.joke.official.api.models.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("joke/")
public class JokeResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/send")
    public Joke getJoke() {
        Joke joke = restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke", Joke.class);
        System.out.println(">> Sending a joke...");
        System.out.println("   >> " +joke.getSetup());
        System.out.println("   >> " +joke.getPunchline());
        return joke;

    }
}
