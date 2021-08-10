package choi.seowon.todoproject.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import choi.seowon.todoproject.Model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

}
