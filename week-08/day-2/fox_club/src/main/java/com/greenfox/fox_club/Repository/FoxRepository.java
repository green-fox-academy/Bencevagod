package com.greenfox.fox_club.Repository;

import com.greenfox.fox_club.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends CrudRepository<User, Long> {
}
