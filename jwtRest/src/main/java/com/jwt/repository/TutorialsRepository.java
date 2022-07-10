package com.jwt.repository;

import com.jwt.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TutorialsRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(Long id);
}
