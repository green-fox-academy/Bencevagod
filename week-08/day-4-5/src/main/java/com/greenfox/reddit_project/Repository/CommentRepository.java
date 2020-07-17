package com.greenfox.reddit_project.Repository;

import com.greenfox.reddit_project.Model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {


}
