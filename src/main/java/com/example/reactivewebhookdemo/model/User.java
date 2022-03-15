package com.example.reactivewebhookdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString
@NoArgsConstructor
@Table("users")
public class User {
  @Id
  private Integer id;
  private String name;
  private String email;
}

