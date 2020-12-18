package com.web.project.java.campify.campifywebprojectjava.camp;

public class Campground {

    private String name;
    private String src;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setDescription(String description) {this.description = description; }

    public Campground(String name, String src, String description) {
        this.name = name;
        this.src = src;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getSrc() {
        return src;
    }

    public String getDescription() {return description; }

    @Override
    public String toString() {
        return name + " " + src + " " + description;
    }

}
