package com.manab.springdatacouchbase.core.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.couchbase.config.BeanNames;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.stereotype.Service;

import com.manab.springdatacouchbase.core.dao.doc.ProductDoc;
import com.manab.springdatacouchbase.core.exception.ApiException;
import com.manab.springdatacouchbase.core.exception.ErrorType;
import com.manab.springdatacouchbase.core.service.ProductService;

/**
 * Service that manages the creation of a Product to exemplify the use of unique number (uuid) for
 * key generation.
 *
 */

@Service
public class ProductServiceImpl implements ProductService {

  // add the qualifier in case you have multiple buckets in your configuration otherwise remove it
  @Autowired
  @Qualifier(BeanNames.COUCHBASE_TEMPLATE)
  private CouchbaseTemplate template;

  @Override
  public ProductDoc findById(String id) {
    final Optional<ProductDoc> productObj = Optional.ofNullable(template.findById(id, ProductDoc.class));
    return productObj.orElseThrow(() -> new ApiException(ErrorType.PRODUCT_NOT_FOUND));
  }

  @Override
  public void create(ProductDoc product) {
    template.insert(product);
  }

}
