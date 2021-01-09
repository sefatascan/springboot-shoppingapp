package com.stascan.shoppingapp.product.repository.elasticsearch;

import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.stascan.shoppingapp.product.model.elasticsearch.ProductEsModel;

@Repository
public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEsModel, String> {

}
