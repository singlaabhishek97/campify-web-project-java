package com.web.project.java.campify.campifywebprojectjava.camp;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CampDaoService {
    private static List<Campground> camps = new ArrayList<>();

    private static int campsCount = 3;

    static {
        camps.add(new Campground("Solang Valley", "https://i.imgur.com/ODDE4xD.jpg"));
        camps.add(new Campground( "Spiti Valley", "https://i.imgur.com/P8T8Sti.jpg"));
}

    public Campground save(Campground camp) {
        camps.add(camp);
        return camp;
    }

    public List<Campground> findAll() {
        return camps;
    }
}
