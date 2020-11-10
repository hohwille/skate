/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.shared;

import io.github.mmm.bean.AbstractBean;
import io.github.mmm.bean.Bean;
import io.github.mmm.bean.Name;
import io.github.mmm.entity.bean.SimpleEntityBean;
import io.github.mmm.entity.id.Id;
import io.github.mmm.entity.id.StringVersionId;
import io.github.mmm.entity.property.id.IdProperty;
import io.github.mmm.property.PropertyMetadataType;
import io.github.mmm.property.string.StringListProperty;
import io.github.mmm.property.string.StringProperty;
import io.github.mmm.validation.ProjectionValidator;
import io.github.mmm.validation.main.ValidatorMandatory;
import io.github.mmm.validation.string.ValidatorEmailSpec;

/**
 * A {@link Bean} for a skill profile of an employee. The {@link #Id() ID} holds the email-address as
 * {@link io.github.mmm.entity.id.Id#getId() primary key}.
 */
@Name("skate.SkillProfile")
public class SkillProfile extends SimpleEntityBean {

  /** Full name (including first and last name) of profile owner. */
  public final StringProperty Name;

  /** Skills of profile owner. */
  public final StringListProperty Skills;

  /** Phone number of profile owner. */
  public final StringProperty Phone;

  /** Office location of profile owner. */
  public final OfficeProperty Office;

  /** Comment of the profile owner. */
  public final StringProperty Comment;

  /** Comment of the profile owner. */
  public final StringProperty Email;

  /**
   * The constructor.
   *
   * @param email the #getEmail()
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public SkillProfile(String email) {

    this();
    this.Id.set(new StringVersionId(SkillProfile.class, email));
  }

  /**
   * The constructor.
   */
  @SuppressWarnings("unchecked")
  public SkillProfile() {

    super(new IdProperty<>(StringVersionId.FACTORY, SkillProfile.class,
        new PropertyMetadataType<>(ValidatorMandatory.get().append(new ProjectionValidator<Id<?>, String>(
            id -> (id == null) ? null : id.getIdAsString(), ValidatorEmailSpec.get())))));
    this.Name = add().newString("Name");
    this.Skills = add(new StringListProperty("Skills"));
    this.Phone = add().newString().withValidator().phoneNumber().and().build("Phone");
    this.Office = add(new OfficeProperty("Office"));
    this.Comment = add().newString("Comment");
    this.Email = add().newString().withValidator().email().and().build("Email");
  }

  @Override
  protected AbstractBean create() {

    return new SkillProfile();
  }

  /**
   * @return the email-address of the owner of this profile. This is technically the
   *         {@link io.github.mmm.entity.id.Id#getId() primary key} of this entity.
   */
  public String getEmail() {

    Id<?> pk = this.Id.get();
    if (pk == null) {
      return null;
    }
    return pk.getIdAsString();
  }

}
