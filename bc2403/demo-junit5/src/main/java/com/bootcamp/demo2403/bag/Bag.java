package com.bootcamp.demo2403.bag;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Bag {
  private List<Ball> balls;

  public Bag() {
    balls = new LinkedList<>();
  }

  public boolean add(int value, Color color) {
    return this.balls.add(Ball.of(value, color));
  }

  public Ball withdraw() throws IllegalStateException{
    // int n = this.balls.size();
    // Random random = new Random();
    // return this.balls.remove(random.nextInt(n) + 1);
    if (this.balls.size() <= 0)
      throw new IllegalStateException();
    int idx = new Random().nextInt(this.balls.size());
    return this.balls.remove(idx);

  }

  public int sumOfValues() {
    // int sum = 0;
    // for (Ball b : balls) {
    //   sum += b.getValue();
    // }
    // return sum;
    return this.balls.stream() //
      .mapToInt(e -> e.getValue()) //
      .sum();
  }

    public int size() {
      return balls.size();
    }
  
}
