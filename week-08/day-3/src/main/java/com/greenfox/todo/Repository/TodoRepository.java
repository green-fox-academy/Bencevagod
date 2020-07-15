package com.greenfox.todo.Repository;

import com.greenfox.todo.Model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    //@Query("select c from Todo c")
    List<Todo> findAll();
}
