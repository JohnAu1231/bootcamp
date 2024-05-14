package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data  // @RequiredArgsConstructor, @ToString, @EqualsANDHashCode, @Getter, @Setter
@AllArgsConstructor
public class Book {
  private final String name;
  @NonNull
  private Color color;

}
