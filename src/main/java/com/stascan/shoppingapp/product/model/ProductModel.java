package com.stascan.shoppingapp.product.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "product")
@Data
@EqualsAndHashCode(of = "id")
@Builder
public class ProductModel {
	@Id
	private String id;
	private String name;
	private String code;
	private String description;
	private String companyId;
	private String features;
	private String categoryId;
	private Boolean active;
	private List<ProductImageModel> productImage;
}
