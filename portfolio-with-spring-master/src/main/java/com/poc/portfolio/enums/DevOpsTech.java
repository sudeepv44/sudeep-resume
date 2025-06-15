package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum DevOpsTech {
  DOCKER("Docker", ExperienceLevel.BEGINNER.name()), JENKINS("Jenkins",
      ExperienceLevel.BEGINNER.name()), KUBERNETES("Kubernetes", ExperienceLevel.PROFESSIONAL
          .name()),SPLUNK("", ExperienceLevel.EXPERIENCED.name());

  private final String technology;
  private final String experienceLevel;

  DevOpsTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
