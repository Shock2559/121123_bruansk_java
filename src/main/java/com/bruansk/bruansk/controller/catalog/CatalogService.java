package com.bruansk.bruansk.controller.catalog;

import com.bruansk.bruansk.entity.Catalog;
import com.bruansk.bruansk.repository.CatalogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CatalogService {

    private final CatalogRepository catalogRepository;

    public ResponseEntity<Object> getProductByIdParent(int id) {

        List<ResponseCatalog> result = new ArrayList<>();

        try {
            List<Catalog> catalogList = catalogRepository.my_getProductByIdParent(id);

            for(Catalog c: catalogList) {
                result.add(ResponseCatalog.builder()
                .id(c.getId())
                .name(c.getName())
                .id_parent(c.getId_parent())
                .cost(c.getCost())
                .build());
            }

        }catch (Exception e) {
            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}


