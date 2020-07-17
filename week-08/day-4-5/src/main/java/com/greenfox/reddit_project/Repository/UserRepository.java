package com.greenfox.reddit_project.Repository;

import com.greenfox.reddit_project.Model.RedditUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<RedditUser, Long> {


}
