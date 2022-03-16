package com.submarine.model;

import javax.persistence.*;

/**
 * @author Hamza Amentag
 * @since 3/16/2022
 */
@Entity
@Table(name = "SUBMARINE")
public class Submarine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String submarineClass;
    private String ops;

    //no-args constructor for jpa
    public Submarine() {
    }

    public Submarine(Long id, String name, String submarineClass, String ops) {
        this.id = id;
        this.name = name;
        this.submarineClass = submarineClass;
        this.ops = ops;
    }

    public Submarine(String name, String submarineClass, String ops) {
        this.name = name;
        this.submarineClass = submarineClass;
        this.ops = ops;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubmarineClass() {
        return submarineClass;
    }

    public void setSubmarineClass(String submarineClass) {
        this.submarineClass = submarineClass;
    }

    public String getOps() {
        return ops;
    }

    public void setOps(String ops) {
        this.ops = ops;
    }
}