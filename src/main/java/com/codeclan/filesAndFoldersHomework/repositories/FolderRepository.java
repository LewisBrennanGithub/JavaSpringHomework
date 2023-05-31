package com.codeclan.filesAndFoldersHomework.repositories;

import com.codeclan.filesAndFoldersHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
