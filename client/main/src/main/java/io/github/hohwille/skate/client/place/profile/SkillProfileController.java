/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.place.profile;

import io.github.mmm.ui.api.controller.UiEmbedding;
import io.github.mmm.ui.api.controller.UiPlace;
import io.github.mmm.ui.spi.controller.AbstractUiController;

/**
 * {@link AbstractUiController Controller} for {@link SkillProfileView}.
 */
public class SkillProfileController extends AbstractUiController<SkillProfileView> {

  /** @see #getId() */
  public static final String ID = ID_HOME;

  /**
   * The constructor.
   */
  public SkillProfileController() {

    super();
  }

  @Override
  public String getId() {

    return ID;
  }

  @Override
  protected SkillProfileView createView() {

    return new SkillProfileView();
  }

  @Override
  protected UiEmbedding doShow(UiPlace newPlace, UiEmbedding newSlot) {

    return UiEmbedding.CONTENT;
  }

}
