package com.web.project.java.campify.campifywebprojectjava.camp;

public class Campground {

    private String name;
    private String src;
    private String description;

    private Campground(CampBuilder builder) {
        this.name = builder.name;
        this.src = builder.src;
        this.description = builder.description;
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

    // Builder class
    public static class CampBuilder {

        private String name;
        private String src;
        private String description;

        public CampBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CampBuilder setSrc(String src) {
            this.src = src;
            return this;
        }

        public CampBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Campground getCamp() {
            return new Campground(this);
        }
    }


}
