/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.place.profile;

import java.util.Objects;

import io.github.hohwille.skate.shared.Country;
import io.github.hohwille.skate.shared.Office;
import io.github.hohwille.skate.shared.SkillProfile;
import io.github.mmm.marshall.JsonFormat;
import io.github.mmm.ui.api.widget.panel.UiCustomVerticalPanel;
import io.github.mmm.ui.api.widget.value.UiCustomEditor;

/**
 * View of {@link SkillProfileController}.
 */
public class SkillProfileView extends UiCustomVerticalPanel {

  /**
   * The constructor.
   */
  public SkillProfileView() {

    super();
    SkillProfileForm form = new SkillProfileForm();
    UiCustomEditor<SkillProfile> editor = new UiCustomEditor<>(form, this::onSave);
    addChild(editor);
    SkillProfile profile = new SkillProfile();
    profile.Name.set("John Doe");
    profile.Office.set(new Office(Country.DE, "Frankfurt"));
    profile.Phone.set("+49 69 9515 0");
    profile.Comment.set("Nice guy");
    editor.setValue(profile);
    setReadOnly(false);
  }

  private void onSave(SkillProfile skillProfile) {

    Objects.requireNonNull(skillProfile);
    System.out.println(JsonFormat.of().write(skillProfile));
  }

}
