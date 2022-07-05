package com.gitProject.dto;

import com.gitProject.entities.LittleDuduEntity;

public class LittleDudu {
    private long id;
    private String name;
    private float age;

    public LittleDudu() {
    }

    public LittleDudu(LittleDuduEntity littleDuduEntity) {
        this.id = littleDuduEntity.getId();
        this.name = littleDuduEntity.getName();
        this.age = littleDuduEntity.getAge();
    }

    public LittleDudu(long id, String name, float age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public LittleDudu(String name, float age) {
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

    @Override
    public String toString() {
        return "LittleDudu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
