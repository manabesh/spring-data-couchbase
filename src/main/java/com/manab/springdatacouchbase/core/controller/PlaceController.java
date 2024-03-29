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

import com.manab.springdatacouchbase.core.dao.doc.PlaceDoc;
import com.manab.springdatacouchbase.core.service.PlaceService;

/**
 * Place REST Controller
 *
 */
@RestController
@RequestMapping("/places")
public class PlaceController {

  protected static final Logger logger = LoggerFactory.getLogger(PlaceController.class);

  @Autowired
  private PlaceService placeService;

  @RequestMapping(value = "/{placeId}", method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  public PlaceDoc findById(@PathVariable Long placeId) {
    logger.info("Find place by id: {}", placeId);
    return placeService.findById(placeId);
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.CREATED)
  public PlaceDoc create(@Valid @RequestBody PlaceDoc place) {
    logger.info("Create place");
    return placeService.create(place);
  }

}
