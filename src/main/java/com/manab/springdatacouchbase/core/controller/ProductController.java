package com.manab.springdatacouchbase.core.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.manab.springdatacouchbase.core.dao.doc.ProductDoc;
import com.manab.springdatacouchbase.core.service.ProductService;

/**
 * Product REST Controller
 *
 */
@RestController
@RequestMapping("/products")
public class ProductController {

  protected static final Logger logger = LoggerFactory.getLogger(ProductController.class);

  @Autowired
  private ProductService productService;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  public ProductDoc findById(@PathVariable String id) {
    logger.info("Find product by id: {}", id);
    return productService.findById(id);
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.CREATED)
  public void create(@Valid @RequestBody ProductDoc product) {
    logger.info("Create product");
    productService.create(product);
  }

}
