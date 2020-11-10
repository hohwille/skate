/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.widget;

import io.github.hohwille.skate.shared.Country;
import io.github.hohwille.skate.shared.Office;
import io.github.mmm.ui.api.binding.UiValueBinding;
import io.github.mmm.ui.api.widget.form.UiCustomHorizontalInput;
import io.github.mmm.ui.api.widget.input.UiComboBox;
import io.github.mmm.ui.api.widget.input.UiTextInput;

/**
 * {@link UiCustomHorizontalInput} for {@link Office}.
 */
public class OfficeInput extends UiCustomHorizontalInput<Office> {

  private final UiComboBox<Country> countryInput;

  private final UiTextInput cityInput;

  /**
   * The constructor.
   */
  public OfficeInput() {

    super();
    this.countryInput = UiComboBox.ofEnum("Country", Country.class);
    this.cityInput = UiTextInput.of("City");
    addChild(this.countryInput);
    addChild(this.cityInput);
    initBinding(new Binding());
  }

  private class Binding implements UiValueBinding<Office> {

    @Override
    public void setValue(Office value, boolean forUser) {

      Country country = null;
      String city = null;
      if (value != null) {
        country = Country.valueOf(value.getCountry());
        city = value.getCity();
      }
      OfficeInput.this.countryInput.setValue(country, forUser);
      OfficeInput.this.cityInput.setValue(city, forUser);
    }

    @Override
    public Office getValue() {

      Country country = OfficeInput.this.countryInput.getValue();
      String city = OfficeInput.this.cityInput.getValue();
      if (country == null) {
        return null;
      }
      return new Office(country.name(), city);
    }

  }

}
