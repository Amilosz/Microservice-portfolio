package com.github.ProjectAPI.models;

public class GithubProject {


    private String name;
    private String stargazers_count;
    private String html_url;
    private String language;

    public GithubProject(String name, String stargazers_count, String license, String html_url, String language) {
        this.name = name;
        this.stargazers_count = stargazers_count;
        this.html_url = html_url;
        this.language = language;
    }

    public GithubProject() {
    }

    public String getStargazers_count() {
        return stargazers_count;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getLanguage() {
        return language;
    }

    public String getName() {
        return name;
    }


}
