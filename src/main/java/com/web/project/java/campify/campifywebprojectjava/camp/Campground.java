package com.web.project.java.campify.campifywebprojectjava.camp;

import java.util.concurrent.atomic.AtomicInteger;

public class Campground {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int campID;

    private String name;
    private String src;
    private String description;

    private Campground(CampBuilder builder) {
        this.campID = count.incrementAndGet();
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

    public String getDescription() { return description; }

    public int getCampID() { return campID; }

    @Override
    public String toString() {
        return campID + name + " " + src + " " + description;
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
