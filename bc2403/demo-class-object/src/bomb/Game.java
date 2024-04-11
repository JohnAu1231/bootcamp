package bomb;

import java.util.Random;
import java.util.Scanner;

public class Game {
  
  public static void main(String[] args) {
    
    // min 1, max = 100
    // random = 47 -> bomb
    // Round 1: Please pick a number between 1-100 -> 45, continue
    // Round 2: Please pick a number between 46-100 -> 59 -> continue
    // Round 3: Please pick a number between 46-59 -> 47 -> exit

    Scanner a = new Scanner(System.in);
    int input; 
    int max = 100;
    int min = 1;
    int bomb = new Random().nextInt(max) + 1;



    do {
      System.out.println("Please pick a number between "+ min +  "-" + max +":");
      input = a.nextInt();
      if (input > max || input < min) {
        System.out.println("Your input number is out of range.");
        continue;
      }
      if (input < bomb) {
        min = input + 1;
      } else if (input > bomb) {
        max = input - 1;
      } else {
      }

    }
    while(input != bomb) ;
    System.out.println("Bomb! The game is end");
      

  }
}
