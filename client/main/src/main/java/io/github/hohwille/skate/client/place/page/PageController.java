/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.client.place.page;

import io.github.hohwille.skate.client.place.profile.SkillProfileController;
import io.github.hohwille.skate.client.place.search.SkillSearchController;
import io.github.mmm.ui.api.controller.UiEmbedding;
import io.github.mmm.ui.api.controller.UiNavigationManager;
import io.github.mmm.ui.api.controller.UiPlace;
import io.github.mmm.ui.api.controller.action.UiActionNavigate;
import io.github.mmm.ui.api.widget.menu.UiMenu;
import io.github.mmm.ui.api.widget.menu.UiMenuBar;
import io.github.mmm.ui.api.widget.panel.UiBorderPanel;
import io.github.mmm.ui.api.widget.window.UiMainWindow;
import io.github.mmm.ui.spi.controller.AbstractUiController;
import io.github.mmm.ui.spi.controller.AbstractUiControllerPage;

/**
 * {@link AbstractUiController Controller} for home dialog.
 */
public class PageController extends AbstractUiControllerPage {

  private UiMenuBar menuBar;

  /**
   * The constructor.
   */
  public PageController() {

    super();
  }

  @Override
  public String getTitle() {

    return "Skate - Skill Date App";
  }

  @Override
  protected UiBorderPanel createView() {

    initMenuBar();
    return super.createView();
  }

  @Override
  protected UiEmbedding doShow(UiPlace newPlace, UiEmbedding newSlot) {

    return super.doShow(newPlace, newSlot);
  }

  private void initMenuBar() {

    if (this.menuBar != null) {
      return;
    }
    this.menuBar = UiMenuBar.get();
    UiMenu fileMenu = this.menuBar.addMenu("File");
    fileMenu.addItem("Back", e -> {
      UiNavigationManager.get().navigateBack();
    });
    fileMenu.addItem("Forward", e -> {
      UiNavigationManager.get().navigateForward();
    });
    fileMenu.addSeparator();
    fileMenu.addItem("Exit", e -> {
      UiMainWindow.get().setVisible(false);
    });
    UiMenu optionsMenu = this.menuBar.addMenu("Navigation");
    optionsMenu.addItem(UiActionNavigate.ofId(SkillProfileController.ID));
    optionsMenu.addItem(UiActionNavigate.ofId(SkillSearchController.ID));
  }

}
