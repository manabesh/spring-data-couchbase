package com.manab.springdatacouchbase.core.service;

import com.manab.springdatacouchbase.core.dao.doc.CarDoc;

/**
 * Interface for the Car Service Implementation
 *
 */

public interface CarService {

  CarDoc findByKey(Long number, String manufacturer);

  void create(CarDoc car);
}
