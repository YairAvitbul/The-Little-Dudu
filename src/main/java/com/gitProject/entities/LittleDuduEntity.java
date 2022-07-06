package com.gitProject.entities;

import com.gitProject.dto.LittleDudu;

import javax.persistence.*;

@Entity
@Table(name = "littleDudus")
public class LittleDuduEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private float age;

    public LittleDuduEntity() {
    }

    public LittleDuduEntity(LittleDudu littleDudu) {
        this.id = littleDudu.getId();
        this.name = littleDudu.getName();
        this.age = littleDudu.getAge();
    }

    public LittleDuduEntity(long id, String name, float age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public LittleDuduEntity(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}

