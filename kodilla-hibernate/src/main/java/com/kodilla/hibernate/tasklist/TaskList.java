package com.kodilla.hibernate.tasklist;

import jakarta.persistence.*;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {

    private long id;
    private String listName;
    private String description;

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue
    @Id
    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
