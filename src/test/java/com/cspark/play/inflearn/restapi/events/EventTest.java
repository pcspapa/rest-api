package com.cspark.play.inflearn.restapi.events;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EventTest {

  public static final String NAME = "Inflearn Spring REST API";
  public static final String DESCRIPTION = "REST API development with Spring";

  @Test
  void builder() {
    Event event = Event.builder()
        .name(NAME)
        .description(DESCRIPTION)
        .build();
    assertThat(event).isNotNull();
  }

  @Test
  void javaBean() {
    // When
    Event event = new Event();
    event.setName(NAME);
    event.setDescription(DESCRIPTION);

    // Then
    assertThat(event.getName()).isEqualTo(NAME);
    assertThat(event.getDescription()).isEqualTo(DESCRIPTION);
  }
}
