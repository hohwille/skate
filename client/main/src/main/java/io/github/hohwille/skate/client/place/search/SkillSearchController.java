/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.place.search;

import io.github.mmm.ui.api.controller.UiEmbedding;
import io.github.mmm.ui.api.controller.UiPlace;
import io.github.mmm.ui.spi.controller.AbstractUiController;

/**
 * {@link AbstractUiController Controller} for {@link SkillSearchView}.
 */
public class SkillSearchController extends AbstractUiController<SkillSearchView> {

  /** @see #getId() */
  public static final String ID = "Search";

  /**
   * The constructor.
   */
  public SkillSearchController() {

    super();
  }

  @Override
  public String getId() {

    return ID;
  }

  @Override
  protected SkillSearchView createView() {

    return new SkillSearchView();
  }

  @Override
  protected UiEmbedding doShow(UiPlace newPlace, UiEmbedding newSlot) {

    return UiEmbedding.CONTENT;
  }

}
