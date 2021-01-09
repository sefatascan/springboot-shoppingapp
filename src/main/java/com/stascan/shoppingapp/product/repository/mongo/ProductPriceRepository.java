package com.stascan.shoppingapp.product.repository.mongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.stascan.shoppingapp.product.model.ProductPriceModel;

@Repository
public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPriceModel, String> {

}
