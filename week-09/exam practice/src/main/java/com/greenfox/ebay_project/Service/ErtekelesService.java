package com.greenfox.ebay_project.Service;

import com.greenfox.ebay_project.Model.Ertekeles;
import com.greenfox.ebay_project.Repository.ErtekelesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ErtekelesService {

    private ErtekelesRepository repo;

    @Autowired
    public ErtekelesService(ErtekelesRepository repo) {
        this.repo = repo;
    }

    public List<Ertekeles> findErtekelesekByHirdetesId(Long id) {
        List<Ertekeles> ertekelesek = repo.findAllByHirdetes_Id(id);
        Collections.reverse(ertekelesek);
        return ertekelesek;
    }

    public void saveReview(Ertekeles ertekeles) {
        repo.save(ertekeles);
    }
}
