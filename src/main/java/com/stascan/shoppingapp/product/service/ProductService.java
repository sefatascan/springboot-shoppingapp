package com.stascan.shoppingapp.product.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.stascan.shoppingapp.product.dto.ProductResponse;
import com.stascan.shoppingapp.product.dto.ProductSaveRequest;
import com.stascan.shoppingapp.product.repository.elasticsearch.ProductEsRepository;
import com.stascan.shoppingapp.product.repository.mongo.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepository productRepository;
	private final ProductEsRepository productEsRepository;

	List<ProductResponse> getByPaging(Pageable pageable) {
		// TODO: es den sorgula
		// TODO: Calc fieldlar
		// TODO: redis
		return null;
	}

	ProductResponse save(ProductSaveRequest productSaveRequest) {
		// TODO: mongo ya yaz
		// TODO: es den güncelle
		// TODO: es dne cevap dön
		return null;
	}
}
