package com.greenfox.fox_club.Repository;

import com.greenfox.fox_club.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
    User findUserByName(String userName);
}
