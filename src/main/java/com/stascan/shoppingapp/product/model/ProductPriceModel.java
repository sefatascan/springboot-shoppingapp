package com.stascan.shoppingapp.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.stascan.shoppingapp.product.util.EnumCurrency;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Document(collection = "product_price")
@Data
@EqualsAndHashCode(of = "id")
public class ProductPriceModel {
	@Id
	private String id;
	private String productId;
	private String price;
	private EnumCurrency currency;

}
