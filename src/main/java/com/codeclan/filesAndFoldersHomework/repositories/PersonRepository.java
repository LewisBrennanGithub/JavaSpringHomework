package com.codeclan.filesAndFoldersHomework.repositories;

import com.codeclan.filesAndFoldersHomework.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
