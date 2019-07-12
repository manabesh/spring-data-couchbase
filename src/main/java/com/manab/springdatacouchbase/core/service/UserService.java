package com.manab.springdatacouchbase.core.service;

import java.util.List;

import com.manab.springdatacouchbase.core.dao.doc.UserBasicDoc;
import com.manab.springdatacouchbase.core.dao.doc.UserDoc;

/**
 * Interface for the User Service Implementation
 *
 */

public interface UserService {

  // CRUD repository interface

  UserDoc findById(Long id);

  UserDoc create(UserDoc user);

  void update(Long id, UserDoc user);

  void delete(Long id);

  Boolean exists(Long id);

  // Custom methods

  UserDoc findByEmail(String email);

  List<UserDoc> findUsersByNickname(String nickname);

  List<UserBasicDoc> findUsersByName(String name);

  List<UserDoc> findAll();

  Integer countAll();
}
