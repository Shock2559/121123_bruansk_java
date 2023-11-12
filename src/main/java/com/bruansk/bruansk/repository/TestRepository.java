package com.bruansk.bruansk.repository;

import com.bruansk.bruansk.entity.TestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Integer> {

    @Query("select t from TestEntity t")
    List<TestEntity> my_getAllTestEntity();

}
