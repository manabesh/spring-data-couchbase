package com.manab.springdatacouchbase.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.manab.springdatacouchbase.core.dao.doc.PlaceDoc;

/**
 * Standard CRUD repository for Place doc + query methods
 *
 */

public interface PlaceRepository extends CrudRepository<PlaceDoc, String> {

}
