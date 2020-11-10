/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.shared;

import io.github.mmm.property.PropertyMetadata;
import io.github.mmm.property.object.SimpleProperty;
import io.github.mmm.property.string.StringProperty;

/**
 * {@link StringProperty} for an {@link Office}.
 */
public class OfficeProperty extends SimpleProperty<Office> {

  private Office value;

  /**
   * The constructor.
   *
   * @param name the {@link #getName() name}.
   * @param metadata the {@link #getMetadata() metadata}.
   */
  public OfficeProperty(String name, PropertyMetadata<Office> metadata) {

    super(name, metadata);
  }

  /**
   * The constructor.
   *
   * @param name the {@link #getName() name}.
   */
  public OfficeProperty(String name) {

    super(name);
  }

  @Override
  protected Office doGet() {

    return this.value;
  }

  @Override
  protected void doSet(Office newValue) {

    this.value = newValue;
  }

  @Override
  public String getAsString() {

    if (this.value == null) {
      return null;
    }
    return this.value.getKey();
  }

  @Override
  public Office parse(String valueAsString) {

    return new Office(valueAsString);
  }

  @Override
  public Class<Office> getValueClass() {

    return Office.class;
  }

  @Override
  public Office getSafe() {

    return get();
  }

}
