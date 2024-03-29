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

import com.manab.springdatacouchbase.core.dao.doc.CarDoc;
import com.manab.springdatacouchbase.core.service.CarService;

/**
 * Car REST Controller
 *
 */
@RestController
@RequestMapping("/cars")
public class CarController {

	protected static final Logger logger = LoggerFactory.getLogger(CarController.class);

	@Autowired
	private CarService carService;

	@RequestMapping(value = "/{number}/{manufacturer}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public CarDoc findByKey(@PathVariable Long number, @PathVariable String manufacturer) {
		logger.info("Find car by key: {}-{}", number, manufacturer);
		return carService.findByKey(number, manufacturer);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@Valid @RequestBody CarDoc car) {
		logger.info("Create car");
		carService.create(car);
	}

}
