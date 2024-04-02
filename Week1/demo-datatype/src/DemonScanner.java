import java.util.Scanner;

public class DemonScanner{
  public static void main(String[] args) {
    Scanner s  = new Scanner(System.in);//
    System.out.println("Please input a number:");
    int input = s.nextInt();//

    System.out.println("input=" + input);
  }
}