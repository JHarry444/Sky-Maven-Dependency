package com.qa.demo.testing;

import java.util.ArrayList;
import java.util.List;

public class DoggoCompetition {


    // DEV
    public static List<String> placements(int place) throws InvalidInputException {
        if (place < 1 || place > 100) throw new InvalidInputException("Must be a number between 1 and 100");
        List<String> placements = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i == place) continue;
            sb.append(i);

            if (i % 10 == 1 && i != 11) sb.append("st");
            else if (i % 10 == 2 && i != 12) sb.append("nd");
            else if (i % 10 == 3 && i != 13) sb.append("rd");
            else sb.append("th");
            placements.add(sb.toString());
            sb.delete(0, sb.length());
        }
        return placements;
    }
}
