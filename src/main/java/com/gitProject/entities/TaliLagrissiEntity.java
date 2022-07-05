package com.gitProject.entities;

import com.gitProject.dto.TaliLagrissi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "talies")
public class TaliLagrissiEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    public TaliLagrissiEntity(TaliLagrissi taliLagrissi) {
        this.id = taliLagrissi.getId();
        this.name = taliLagrissi.getName();
        this.age = taliLagrissi.getAge();
    }

    public TaliLagrissiEntity() {
    }

    public TaliLagrissiEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
