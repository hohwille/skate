/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.place;

import io.github.mmm.ui.api.controller.UiEmbedding;
import io.github.mmm.ui.api.controller.UiPlace;
import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.spi.controller.AbstractUiController;

/**
 * {@link AbstractUiController Controller} for {@link UiEmbedding#CONTENT content}.
 *
 * @param <V> type of the {@link #getView() view}.
 */
public abstract class ContentController<V extends UiRegularWidget> extends AbstractUiController<V> {

  /**
   * The constructor.
   */
  public ContentController() {

    super();
  }

  @Override
  protected UiEmbedding doShow(UiPlace newPlace, UiEmbedding newSlot) {

    return UiEmbedding.CONTENT;
  }

}
