package com.github.MainOutput.resource;

import com.github.MainOutput.models.GithubProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/main")
public class Project {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/project/{userName}")
    public GithubProject[] getProject(@PathVariable("userName") String userName){
        GithubProject[] githubProject = restTemplate.getForObject("http://github-project-api/project/" + userName, GithubProject[].class);

        return githubProject;
    }
}
