package com.greenfox.programmer_fox_club.Service;

import com.greenfox.programmer_fox_club.Model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    List<Fox> foxList;
    String loggedInUser;

    public void setLoggedInUser(String loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

    public FoxService() {
        this.foxList = new ArrayList<>();
        this.loggedInUser = null;
    }

    public void addNewFox(String foxName) {
        Fox fox = new Fox(foxName);
        //fox.addTrick("pooping");
        foxList.add(fox);
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public Fox findFoxByName(String name) {
        return foxList.stream()
                .filter(fox -> fox.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
