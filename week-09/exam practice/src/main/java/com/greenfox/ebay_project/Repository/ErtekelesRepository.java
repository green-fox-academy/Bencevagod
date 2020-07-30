package com.greenfox.ebay_project.Repository;

import com.greenfox.ebay_project.Model.Ertekeles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErtekelesRepository extends CrudRepository<Ertekeles, Long> {

    List<Ertekeles> findAllByHirdetes_Id(Long id);
}
