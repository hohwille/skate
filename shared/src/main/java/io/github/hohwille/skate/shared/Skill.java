/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.shared;

import io.github.mmm.bean.Name;
import io.github.mmm.entity.bean.SimpleEntityBean;
import io.github.mmm.entity.id.StringVersionId;

/**
 * {@link SimpleEntityBean} for a skill.
 */
@Name("skate.Skill")
public class Skill extends SimpleEntityBean {

  /**
   * The constructor.
   */
  public Skill() {

    super(StringVersionId.FACTORY);
  }

}
