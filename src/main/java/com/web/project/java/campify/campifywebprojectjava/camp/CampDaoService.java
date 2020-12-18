package com.web.project.java.campify.campifywebprojectjava.camp;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CampDaoService {
    private static List<Campground> camps = new ArrayList<>();

    private static int campsCount = 3;

    static {
        camps.add(new Campground("Solang Valley", "https://i.imgur.com/ODDE4xD.jpg", "Solang Valley in Manali attracts visitors from the far ends of the world"));
        camps.add(new Campground( "Spiti Valley", "https://i.imgur.com/P8T8Sti.jpg", "Spiti Valley nestled in the Keylong district of Himachal Pradesh"));
}

    public Campground save(Campground camp) {
        camps.add(camp);
        return camp;
    }

    public List<Campground> findAll() {
        return camps;
    }
}
