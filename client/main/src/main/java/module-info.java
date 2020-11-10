/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the portable UI of this SKATE app.
 *
 * @provides io.github.mmm.ui.api.controller.UiController
 * @provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryProperty
 */
@SuppressWarnings("rawtypes") //
module io.github.hohwille.skate.client.main {

  requires transitive io.github.mmm.ui.api.all;

  requires transitive io.github.mmm.ui.spi.controller;

  requires transitive io.github.hohwille.skate.shared;

  provides io.github.mmm.ui.api.controller.UiController with //
      io.github.hohwille.skate.client.place.profile.SkillProfileController, //
      io.github.hohwille.skate.client.place.search.SkillSearchController, //
      io.github.hohwille.skate.client.place.page.PageController //
  ;

  provides io.github.mmm.ui.api.factory.UiSingleWidgetFactoryProperty with //
      io.github.hohwille.skate.client.widget.factory.UiWidgetFactoryOfficeProperty;

  exports io.github.hohwille.skate.client.place.page;

}
