package com.stascan.shoppingapp.product.model.elasticsearch;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(indexName = "product")
@Data
@EqualsAndHashCode(of = "id")
@Builder
public class ProductEsModel {
	private String id;
	private String name;
	private String code;
	private String description;
	private CompanyEsModel company;
	private String features;
	private CategoryEsModel category;
	private Boolean active;
}
