package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum Clients {
  ORACLE("Sudeep Vishwakarma");
  /*  MCQ(""), AMEX(""), EY(""), HSBC(""), CAPG(
      ""), INFOSYS("");*/

  private final String value;

  Clients(String value) {
    this.value = value;
  }

}
