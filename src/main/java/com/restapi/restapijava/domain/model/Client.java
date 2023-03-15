package com.restapi.restapijava.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Client {
  private Long id;
  private String name;
  private String email;
  private String phone;
}
