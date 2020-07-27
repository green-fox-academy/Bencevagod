package com.greenfox.ebay_project.Repository;

import com.greenfox.ebay_project.Model.Ertekeles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErtekelesRepository extends CrudRepository<Ertekeles, Long> {


}
