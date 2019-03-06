package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return new ArrayList<>();
        }

        ArrayList<String> ListOfWords = new ArrayList<>();
        for (int i = 0; i < value.length() + 1; i++) {
            ListOfWords.add(value.substring(i, value.length()));
        }
        return ListOfWords;
    }

}
