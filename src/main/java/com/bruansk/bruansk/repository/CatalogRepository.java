package com.bruansk.bruansk.repository;

import com.bruansk.bruansk.entity.Catalog;
import com.bruansk.bruansk.entity.TestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends CrudRepository<Catalog, Integer> {

    @Query("select c from Catalog c where c.id_parent = :id")
    List<Catalog> my_getProductByIdParent(int id);

}
