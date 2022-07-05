package com.gitProject.dto;

import com.gitProject.entities.TaliLagrissiEntity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TaliLagrissi {
    private long id;
    private String name;
    private int age;

    public TaliLagrissi(TaliLagrissiEntity taliLagrissiEntity) {
        this.id = taliLagrissiEntity.getId();
        this.name = taliLagrissiEntity.getName();
        this.age = taliLagrissiEntity.getAge();
    }

    public TaliLagrissi(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
