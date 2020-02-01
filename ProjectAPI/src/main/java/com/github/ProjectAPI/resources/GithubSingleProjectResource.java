package com.github.ProjectAPI.resources;

import com.github.ProjectAPI.models.GithubProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/project")
public class GithubSingleProjectResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public GithubProject[] getMovieInfo(@PathVariable("userId") String userId)
    {
        GithubProject[] githubProjects = restTemplate.getForObject("https://api.github.com/users/"+ userId + "/repos", GithubProject[].class);
        System.out.println(">> Sending Array of "+ githubProjects.length + " projects..." );
        return githubProjects;
    }
}
