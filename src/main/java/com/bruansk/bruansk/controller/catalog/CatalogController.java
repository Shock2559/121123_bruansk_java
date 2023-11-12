package com.bruansk.bruansk.controller.catalog;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }


    @CrossOrigin
    @GetMapping("/get-list-product-by-id-parent")
    public ResponseEntity<Object> getListProductByIdParent(@RequestParam Integer id){
        return catalogService.getProductByIdParent(id);
    }

}
