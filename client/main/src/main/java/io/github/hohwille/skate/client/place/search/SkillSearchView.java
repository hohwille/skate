/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.place.search;

import java.util.Objects;

import io.github.hohwille.skate.client.place.profile.SkillProfileForm;
import io.github.hohwille.skate.shared.SkillProfile;
import io.github.mmm.marshall.JsonFormat;
import io.github.mmm.ui.api.event.action.UiActionSearch;
import io.github.mmm.ui.api.widget.button.UiButton;
import io.github.mmm.ui.api.widget.panel.UiButtonPanel;
import io.github.mmm.ui.api.widget.panel.UiCustomVerticalPanel;

/**
 * View of {@link SkillSearchController}.
 */
public class SkillSearchView extends UiCustomVerticalPanel {

  /**
   * The constructor.
   */
  public SkillSearchView() {

    super();
    SkillProfileForm form = new SkillProfileForm();
    addChild(form);
    UiActionSearch search = e -> {
      boolean valid = form.validate();
      if (valid) {
        onSearch(form.getValue());
      }
    };
    UiButton button = UiButton.of(search);
    UiButtonPanel buttonPanel = UiButtonPanel.of(button);
    addChild(buttonPanel);
  }

  private void onSearch(SkillProfile skillProfile) {

    Objects.requireNonNull(skillProfile);
    System.out.println("Triggering search for:");
    System.out.println(JsonFormat.of().write(skillProfile));
  }

}
