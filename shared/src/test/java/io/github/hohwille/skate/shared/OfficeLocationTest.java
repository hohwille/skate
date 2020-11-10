/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.hohwille.skate.shared;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test of {@link Office}.
 */
public class OfficeLocationTest extends Assertions {

  /**
   * Test composition and decomposition of the segments {@link Office#getCountry() country} and
   * {@link Office#getCity() city}.
   */
  @Test
  public void testSegments() {

    // given
    Office office = new Office("DE/Frankfurt");
    Office office2 = new Office("DE", "Frankfurt");

    // when + then
    assertThat(office.getCountry()).isEqualTo("DE");
    assertThat(office.getCity()).isEqualTo("Frankfurt");
    assertThat(office.getId().getIdAsString()).isEqualTo("DE/Frankfurt");
    assertThat(office2.getCountry()).isEqualTo("DE");
    assertThat(office2.getCity()).isEqualTo("Frankfurt");
    assertThat(office2.getId().getIdAsString()).isEqualTo("DE/Frankfurt");
    assertThat(office.isEqualTo(office2)).isTrue();
  }

}
