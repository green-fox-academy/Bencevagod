package com.greenfox.fox_club.Service;

import com.greenfox.fox_club.Model.Fox;
import com.greenfox.fox_club.Model.Trick;
import com.greenfox.fox_club.Model.TrickType;
import com.greenfox.fox_club.Model.User;
import com.greenfox.fox_club.Repository.FoxRepository;
import com.greenfox.fox_club.Repository.TrickRepository;
import com.greenfox.fox_club.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxService {

    private List<Fox> foxList;
    private String loggedInUser;

    private FoxRepository foxRepo;
    private UserRepository userRepo;
    private TrickRepository trickRepo;

    public FoxService() {}

    public void setLoggedInUser(String loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

    @Autowired
    public FoxService(FoxRepository foxRepository, UserRepository userRepository, TrickRepository trickRepository) {
        this.foxList = new ArrayList<>();
        this.loggedInUser = null;
        this.foxRepo = foxRepository;
        this.userRepo = userRepository;
        this.trickRepo = trickRepository;
    }

    public void addNewFox(String foxName) {
//        Fox fox = new Fox(foxName);
//        foxList.add(fox);
        foxRepo.save(new Fox(foxName));

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

    public void saveAccount(String name, String password) {
        userRepo.save(new User(name, password));
    }

    public List<Trick> getLearnableTricks() {
        return trickRepo.FindAll().stream()
                .filter(e -> foxRepo.findAllTrick().stream().anyMatch(trick -> trick.equals(e.trickType())))
                .collect(Collectors.toList());
    }
}
