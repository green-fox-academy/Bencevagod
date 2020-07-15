package com.greenfox.fox_club.Repository;

import com.greenfox.fox_club.Model.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrickRepository extends CrudRepository<Trick, Long> {

    List<Trick> FindAll();
    Trick findTrickByName(String trick);
}
