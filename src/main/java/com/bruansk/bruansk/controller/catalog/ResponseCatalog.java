package com.bruansk.bruansk.controller.catalog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseCatalog {
    private Integer id;
    private String name;
    private Integer id_parent;
    private float cost;
}
