package com.example.rest.api.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cat6")
public class Cat6 {

    //MEM VARS
    @Id
    @GeneratedValue
    private int id;
    private String name;

    //CONSTRUCTORS
    public Cat6() {
        super();
    }

    public Cat6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cat6(String name) {
        this.name = name;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
