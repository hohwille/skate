/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.widget.factory;

import io.github.hohwille.skate.client.widget.OfficeInput;
import io.github.hohwille.skate.shared.Office;
import io.github.hohwille.skate.shared.OfficeProperty;
import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryProperty;
import io.github.mmm.ui.api.widget.input.UiInput;

/**
 * {@link UiSingleWidgetFactoryProperty} for {@link OfficeProperty}.
 */
public class UiWidgetFactoryOfficeProperty implements UiSingleWidgetFactoryProperty<Office> {

  @Override
  public Class<OfficeProperty> getType() {

    return OfficeProperty.class;
  }

  @Override
  public UiInput<Office> create() {

    return new OfficeInput();
  }

}
