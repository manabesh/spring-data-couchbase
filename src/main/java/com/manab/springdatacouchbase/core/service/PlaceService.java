package com.manab.springdatacouchbase.core.service;

import com.manab.springdatacouchbase.core.dao.doc.PlaceDoc;

/**
 * Interface for the Place Service Implementation
 *
 */

public interface PlaceService {

  PlaceDoc findById(Long id);

  PlaceDoc create(PlaceDoc place);
}
