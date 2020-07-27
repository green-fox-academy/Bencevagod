package com.greenfox.ebay_project.Service;

import com.greenfox.ebay_project.Repository.ErtekelesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErtekelesService {

    private ErtekelesRepository repo;

    @Autowired
    public ErtekelesService(ErtekelesRepository repo) {
        this.repo = repo;
    }
}
