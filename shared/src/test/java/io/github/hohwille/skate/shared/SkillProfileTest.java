/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.shared;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import io.github.mmm.validation.ValidationResult;
import io.github.mmm.validation.main.ValidatorMandatory;
import io.github.mmm.validation.string.ValidatorEmailSpec;

/**
 * Test of {@link SkillProfile}.
 */
public class SkillProfileTest extends Assertions {

  @Test
  public void testValid() {

    // given
    SkillProfile profile = new SkillProfile("john.doe@company.com");
    profile.Name.set("John Doe");
    profile.Office.setAsString("DE/Frankfurt");
    profile.Phone.set("+4969110");
    profile.Skills.add("Java", true);
    profile.Skills.add("Spring", true);
    profile.Skills.add("Quarkus", true);
    profile.Skills.add("Docker", true);
    profile.Skills.add("Angular", true);
    profile.Skills.add("devonfw", true);
    profile.Comment.set("Contact me any time!");

    // when + then
    ValidationResult validationResult = profile.validate();
    assertThat(validationResult.isValid()).as(validationResult.getMessage()).isTrue();
    assertThat(profile.getEmail()).isEqualTo("john.doe@company.com");
  }

  @Test
  public void testEmpty() {

    // given
    SkillProfile profile = new SkillProfile();
    // when + then
    assertThat(profile.getEmail()).isNull();
    ValidationResult validationResult = profile.validate();
    assertThat(validationResult.isValid()).isFalse();
    assertThat(validationResult.containsCode(ValidatorMandatory.ID)).isTrue();
  }

  @Test
  public void testInvalid() {

    // given
    SkillProfile profile = new SkillProfile("name-at-mail.com");
    // when + then
    assertThat(profile.getEmail()).isEqualTo("name-at-mail.com");
    ValidationResult validationResult = profile.validate();
    assertThat(validationResult.isValid()).isFalse();
    assertThat(validationResult.containsCode(ValidatorEmailSpec.ID)).isTrue();
  }

}
