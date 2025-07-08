package io.github.felipevenas.api_tasklist.repositories;

import io.github.felipevenas.api_tasklist.domain.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    boolean existsByTitle(String title);

}
