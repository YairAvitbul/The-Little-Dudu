package com.tali.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tests")
public class TestEntity {
    @Id
    private long id;

    public TestEntity(long id) {
        this.id = id;
    }

    public TestEntity() {
    }
}
