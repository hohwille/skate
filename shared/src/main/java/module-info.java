/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Provides the code shared between client and server of this SKATE app.
 */
// module open for l10n - you may also move l10n bundles to non-JPMS-module.
open module io.github.hohwille.skate.shared {

  requires transitive io.github.mmm.entity.bean;

  exports io.github.hohwille.skate.shared;

}
