package com.github.ProjectAPI.models;

import java.util.ArrayList;
import java.util.List;

public class ProjectList {
    private List<GithubProject> projectsList;

    public ProjectList(){
        projectsList = new ArrayList<>();
    }

    public List<GithubProject> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<GithubProject> projectsList) {
        this.projectsList = projectsList;
    }

    public ProjectList(List<GithubProject> projectsList) {
        this.projectsList = projectsList;
    }
}

