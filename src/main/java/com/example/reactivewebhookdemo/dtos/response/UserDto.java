package com.example.reactivewebhookdemo.dtos.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDto {
  private Integer id;
  private String name;
  private String email;
}
