package com.web.project.java.campify.campifywebprojectjava.camp;

public class Campground {

    private String name;
    private String src;

    public void setName(String name) {
        this.name = name;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Campground(String name, String src) {
        this.name = name;
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public String getSrc() {
        return src;
    }

    @Override
    public String toString() {
        return name + " " + src;
    }

}
