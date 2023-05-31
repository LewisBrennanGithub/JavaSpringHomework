package com.codeclan.filesAndFoldersHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {
//    title / list of files / a person
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "title")
    private String title;

    @JsonIgnoreProperties({"folders"})
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
    @JsonIgnoreProperties({"folder"})
    @OneToMany(mappedBy = "folder")
    private List<File> files;

    public Folder(String title, Person person) {
        this.title = title;
        this.person = person;
        this.files = new ArrayList<>();
    }

    public Folder(){

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Person getPerson() {
        return person;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
