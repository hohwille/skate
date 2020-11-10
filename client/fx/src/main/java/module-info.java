/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
/**
 * Provides the implementation of the UI framework based on JavaFx.
 */
open module io.github.hohwille.skate.client.fx {

  requires transitive io.github.mmm.ui.fx.all;

  requires transitive io.github.mmm.ui.fx.core;

  requires transitive io.github.hohwille.skate.client.main;

  exports io.github.hohwille.skate.client.fx;

}
