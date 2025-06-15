package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum DatabaseTech {
  POSTGRESQL("Spring DATA JPA", ExperienceLevel.PROFESSIONAL.name()), ORACLEDB("Mango DB",
      ExperienceLevel.BEGINNER.name()), MYSQL("MySQL", ExperienceLevel.PROFESSIONAL.name());

  private final String technology;
  private final String experienceLevel;

  DatabaseTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
