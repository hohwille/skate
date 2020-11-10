/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.shared;

import io.github.mmm.bean.Name;
import io.github.mmm.entity.bean.SimpleEntityBean;
import io.github.mmm.entity.id.Id;
import io.github.mmm.entity.id.StringVersionId;

/**
 * {@link SimpleEntityBean} for an office location. The {@link #Id() ID} has the form
 * {@code «CountryCode»[/«City»]}.<br>
 * Examples are {@code DE}, {@code DE/Frankfurt}, {@code ES}, or {@code ES/Valencia}.
 */
@Name("skate.Office")
public class Office extends SimpleEntityBean {

  /**
   * The constructor.
   */
  public Office() {

    super(StringVersionId.FACTORY);
  }

  /**
   * The constructor.
   *
   * @param country the {@link #getCountry() country code}.
   * @param city the {@link #getCity() city}.
   */
  public Office(Country country, String city) {

    this(country + "/" + city);
  }

  /**
   * The constructor.
   *
   * @param country the {@link #getCountry() country code}.
   * @param city the {@link #getCity() city}.
   */
  public Office(String country, String city) {

    this(country + "/" + city);
  }

  /**
   * The constructor.
   *
   * @param id the ID of this office location (e.g. {@code DE/Frankfurt}).
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public Office(String id) {

    this();
    this.Id.set(new StringVersionId(Office.class, id));
  }

  /**
   * @return the country part of this office location.
   */
  public String getCountry() {

    String key = getKey();
    if (key != null) {
      int i = key.indexOf('/');
      if (i >= 0) {
        return key.substring(0, i);
      }
    }
    return key;
  }

  /**
   * @return the city part of this office location.
   */
  public String getCity() {

    String key = getKey();
    if (key != null) {
      int i = key.indexOf('/');
      if (i >= 0) {
        return key.substring(i + 1);
      }
    }
    return null;
  }

  /**
   * @return the key as {@link #getCountry() country}/{@link #getCity() city}.
   */
  public String getKey() {

    Id<?> pk = this.Id.get();
    if (pk == null) {
      return null;
    }
    return pk.getIdAsString();
  }

}
