package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Titles {
  SOFTWARE_DEVELOPMENT_ENGINEER("Java Full Stack Devloper"), CONTENT_CREATOR("Software Development Engineer"), MUSIC_PRODUCER(
      "");

  private final String value;

  Titles(String value) {
    this.value = value;
  }

}
