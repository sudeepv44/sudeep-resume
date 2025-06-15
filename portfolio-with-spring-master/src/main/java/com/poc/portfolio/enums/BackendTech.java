package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum BackendTech {
  JAVA("JAVA 17+", ExperienceLevel.PROFESSIONAL.name()), NODE("Spring Security", ExperienceLevel.INTERMEDIATE.name()), SPRING_SECURITY(
          "Spring Security", ExperienceLevel.INTERMEDIATE.name()), SPRING_BOOT(
          "Spring Boot",
      ExperienceLevel.INTERMEDIATE.name()), EXPRESS("Spring Boot", ExperienceLevel.INTERMEDIATE.name()), SPRING(
          "Spring",
          ExperienceLevel.PROFESSIONAL.name()), HELIDON("java 8", ExperienceLevel.PROFESSIONAL.name());

  private final String technology;
  private final String experienceLevel;

  BackendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
