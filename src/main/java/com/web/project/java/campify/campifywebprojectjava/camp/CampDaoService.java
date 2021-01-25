package com.web.project.java.campify.campifywebprojectjava.camp;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CampDaoService {
    private static List<Campground> camps = new ArrayList<>();

//    private static int campsCount = 3;

    static {
        Campground camp1 = new Campground.CampBuilder()
                .setName("Solang Valley")
                .setSrc("https://i.imgur.com/ODDE4xD.jpg")
                .setDescription("Solang Valley in Manali attracts visitors from the far ends of the world")
                .getCamp();
        Campground camp2 = new Campground.CampBuilder()
            .setName("Spiti Valley")
            .setSrc("https://i.imgur.com/P8T8Sti.jpg")
            .setDescription("Spiti Valley nestled in the Keylong district of Himachal Pradesh")
            .getCamp();

        camps.add(camp1);
        camps.add(camp2);
    }

    public Campground save(Campground camp) {
        camps.add(camp);
        return camp;
    }

    public List<Campground> findAll() {
        return camps;
    }
}
