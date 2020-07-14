package com.greenfox.fox_club.Service;

import com.greenfox.fox_club.Model.Fox;
import com.greenfox.fox_club.Repository.FoxRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> foxList;
    private String loggedInUser;

    private FoxRepository foxRepo;

    public FoxService() {

    }

    public void setLoggedInUser(String loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

    public FoxService(FoxRepository foxRepository) {
        this.foxList = new ArrayList<>();
        this.loggedInUser = null;
        this.foxRepo = foxRepository;
    }

    public void addNewFox(String foxName) {
        Fox fox = new Fox(foxName);
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

    public Boolean passwordsMatch(String password, String repassword) {
        return password.equals(repassword);
    }


}
