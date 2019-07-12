package com.manab.springdatacouchbase.core.service;

import com.manab.springdatacouchbase.core.dao.doc.ProductDoc;

/**
 * Interface for the Product Service Implementation
 *
 */

public interface ProductService {

  ProductDoc findById(String id);

  void create(ProductDoc product);
}
