package com.greenfox.trial_exam.Repository;

import com.greenfox.trial_exam.Model.Alias;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AliasRepository extends CrudRepository<Alias, Long> {

    List<Alias> findAllByAlias(String alias);

//    @Query(nativeQuery = true, value = "SELECT * FROM ALIAS ORDER BY id DESC LIMIT 1")
    List<Alias> findAll();

    Alias findAliasByAlias(String alias);
}
