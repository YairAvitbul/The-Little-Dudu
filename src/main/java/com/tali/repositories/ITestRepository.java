package com.tali.repositories;

import com.tali.entities.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface ITestRepository extends CrudRepository<TestEntity, Long> {
}
