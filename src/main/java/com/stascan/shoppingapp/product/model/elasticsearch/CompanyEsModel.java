package com.stascan.shoppingapp.product.model.elasticsearch;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyEsModel {
	private String id;
	private String name;
	private String code;
}
