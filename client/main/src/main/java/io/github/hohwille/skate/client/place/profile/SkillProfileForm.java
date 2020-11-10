/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.place.profile;

import io.github.hohwille.skate.shared.SkillProfile;
import io.github.mmm.ui.api.binding.data.UiDataBinding;
import io.github.mmm.ui.api.widget.form.UiCustomFormPanel;
import io.github.mmm.ui.api.widget.form.UiFormPanel;

/**
 * {@link UiCustomFormPanel} to edit {@link SkillProfile}.
 */
public class SkillProfileForm extends UiCustomFormPanel<SkillProfile> {

  /**
   * The constructor.
   */
  public SkillProfileForm() {

    super(createForm());
  }

  private static UiFormPanel<SkillProfile> createForm() {

    UiDataBinding binding = new UiDataBinding();
    return binding.createFormPanel(new SkillProfile());
  }

}
