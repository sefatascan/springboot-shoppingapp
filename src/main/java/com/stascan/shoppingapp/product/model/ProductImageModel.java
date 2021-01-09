package com.stascan.shoppingapp.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductImageModel {
	private ImageType imageType;
	private String url;

	public enum ImageType {
		FEATURE, NORMAL;
	}
}
