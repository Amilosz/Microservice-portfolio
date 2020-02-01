package com.github.MainOutput.resource;


import com.github.MainOutput.models.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/main")
public class JokeResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/joke")
    public Joke getJoke() {
        Joke joke = restTemplate.getForObject("http://joke-api/joke/send", Joke.class);
        System.out.println(">> Sending a joke...");
        System.out.println("   >> " +joke.getSetup());
        System.out.println("   >> " +joke.getPunchline());
        return joke;
    }
}
