package com.greenfox.trial_exam.Service;

import com.greenfox.trial_exam.Model.Alias;
import com.greenfox.trial_exam.Repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MainService {

    private AliasRepository repository;

    @Autowired
    public MainService(AliasRepository repository) {
        this.repository = repository;
    }

    public boolean isAliasNotPresentInDatabase(String alias) {
        return repository.findAllByAlias(alias).isEmpty();
    }

    public Integer generateSecretCode() {
        Random r = new Random();
        StringBuilder secretCode = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(10);
            secretCode.append(num);
        }
        return Integer.parseInt(String.valueOf(secretCode));
    }

    public boolean addAlias(String url, String alias) {
        if (isAliasNotPresentInDatabase(alias)) {
            repository.save(new Alias(url, alias, generateSecretCode()));
            return true;
        }
        return false;
    }

    public Alias findLastAlias(){
        return repository.findLast();
    }

//    public Alias findByaAlias
}
