package com.stascan.shoppingapp.product.repository.mongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.stascan.shoppingapp.product.model.ProductModel;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<ProductModel, String> {

}
