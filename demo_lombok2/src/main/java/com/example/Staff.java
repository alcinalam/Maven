package com.example;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Staff {
  private String name;
  private LocalDate joinDate;



  }
