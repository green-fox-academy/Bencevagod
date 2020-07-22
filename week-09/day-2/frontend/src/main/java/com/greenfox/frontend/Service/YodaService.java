package com.greenfox.frontend.Service;

import com.greenfox.frontend.Model.DTO.ErrorMessage;
import com.greenfox.frontend.Model.Entity.Yoda;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class YodaService {

    public ResponseEntity<? extends Object> sithStuff(String sentence) {
        if (sentence != null) {
            List<String> words = new ArrayList<>(Arrays.asList(sentence.split("(?<=[.])")));
            for (int i = 0; i < words.size(); i++) {
                List<String> splittedToWords = new ArrayList<>(Arrays.asList(words.get(i).split(" ")));
                splittedToWords.remove("");
                for (int j = 0; j < splittedToWords.size(); j++) {
                    if (j % 2 != 0 && !splittedToWords.get(j).contains(".")) {
                        String temp1 = splittedToWords.get(j);
                        splittedToWords.set(j, splittedToWords.get(j - 1));
                        splittedToWords.set(j - 1, temp1);
                    }
                    splittedToWords.set(j, splittedToWords.get(j).toLowerCase());
                }
                splittedToWords.set(0, splittedToWords.get(0).substring(0, 1).toUpperCase()+splittedToWords.get(0).substring(1));
                words.set(i, String.join(" ", splittedToWords));
            }
            return ResponseEntity.status(200).body(new Yoda(sentence, String.join(" ", words)));
        }
        return ResponseEntity.status(404).body(new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm."));
    }
}
