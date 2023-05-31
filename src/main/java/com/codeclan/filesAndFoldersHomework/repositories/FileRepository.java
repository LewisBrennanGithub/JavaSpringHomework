package com.codeclan.filesAndFoldersHomework.repositories;

import com.codeclan.filesAndFoldersHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
