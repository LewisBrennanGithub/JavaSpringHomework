package com.codeclan.filesAndFoldersHomework.components;

import com.codeclan.filesAndFoldersHomework.models.File;
import com.codeclan.filesAndFoldersHomework.models.Folder;
import com.codeclan.filesAndFoldersHomework.models.Person;
import com.codeclan.filesAndFoldersHomework.repositories.FileRepository;
import com.codeclan.filesAndFoldersHomework.repositories.FolderRepository;
import com.codeclan.filesAndFoldersHomework.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Person person = new Person("Clive");
        personRepository.save(person);
        Folder folder = new Folder("transcript folder", person);
        folderRepository.save(folder);
        File file1 = new File("transcript", "txt", "1mb", folder);
        fileRepository.save(file1);
        File file2 = new File("transcript", "txt", "1mb", folder);
        fileRepository.save(file2);

    }
}


