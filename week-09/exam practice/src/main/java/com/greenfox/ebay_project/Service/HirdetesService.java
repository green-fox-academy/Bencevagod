package com.greenfox.ebay_project.Service;

import com.greenfox.ebay_project.Model.Hirdetes;
import com.greenfox.ebay_project.Repository.HirdetesRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HirdetesService {

    private HirdetesRpository repo;

    @Autowired
    public HirdetesService(HirdetesRpository repo) {
        this.repo = repo;
    }

    public List<Hirdetes> findAllHirdetes() {
        return (List<Hirdetes>) repo.findAll();
    }

    public List<Hirdetes> listMostPopular() {
        return findAllHirdetes().stream()
                .filter(h -> h.getNumberOfSells()>100)
                .collect(Collectors.toList());
    }

    public List<Hirdetes> search(String search) {
        return findAllHirdetes().stream()
                .filter(h -> h.getTermek().contains(search))
                .collect(Collectors.toList());
    }
}
