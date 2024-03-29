package com.manab.springdatacouchbase.core.dao.doc;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.couchbase.core.mapping.Document;
import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

/**
 * Represents a user doc from Couchbase. The doc key is generated using a Couchbase atomic counter.
 *
 */

@Document
public class UserDoc implements Serializable {

  private static final long serialVersionUID = 3072475211055736282L;
  protected static final String USER_KEY_PREFIX = "user::";

  @Id
  private String key;

  @Field
  private Long id;
  @Field
  private String name;
  @Field
  private List<String> nicknames;
  @Field
  private Integer age;
  @Field
  private String email;

  public UserDoc() {}

  public UserDoc(String key, Long id, String name, List<String> nicknames, Integer age, String email) {
    super();
    this.key = key;
    this.id = id;
    this.name = name;
    this.nicknames = nicknames;
    this.age = age;
    this.email = email;
  }

  public UserDoc(Long id, String name, List<String> nicknames) {
    this.id = id;
    this.name = name;
    this.nicknames = nicknames;
  }

  public static String getKeyFor(Long id) {
    return USER_KEY_PREFIX + id;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
    this.key = UserDoc.getKeyFor(id);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getNicknames() {
    return nicknames;
  }

  public void setNicknames(List<String> nicknames) {
    this.nicknames = nicknames;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((age == null) ? 0 : age.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((key == null) ? 0 : key.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((nicknames == null) ? 0 : nicknames.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    UserDoc other = (UserDoc) obj;
    if (age == null) {
      if (other.age != null)
        return false;
    } else if (!age.equals(other.age))
      return false;
    if (email == null) {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (key == null) {
      if (other.key != null)
        return false;
    } else if (!key.equals(other.key))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (nicknames == null) {
      if (other.nicknames != null)
        return false;
    } else if (!nicknames.equals(other.nicknames))
      return false;
    return true;
  }

}
