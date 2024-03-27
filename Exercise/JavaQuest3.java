import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Input a month number: 2 Input a year: 2016 February 2016 has 29 days
   * 
   * Input a month number: 12 Input a year: 2014 December 2014 has 31 days
   */
  // Program toExercise3Ansumber of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int numberOfDaysInMonth = 0;
    String MonthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

    // Complete the switch statement
    // The February has 29 days: (Every 4 years and the year cannot divded by 100)
    // or The year can divided by 400
    // otherwise the February should have 28 days only
    // how about other months, December?
    switch (month) {
      case 1:
        MonthOfName = "January";
        numberOfDaysInMonth = 31;
        break;
      case 2:
        MonthOfName = "February";
        // numberOfDaysInMonth = 28;
        if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
          numberOfDaysInMonth = 29;
        } else {
          numberOfDaysInMonth = 28;
        }
        break;
      case 3:
        MonthOfName = "March";
        numberOfDaysInMonth = 31;
        break;
      case 4:
        MonthOfName = "April";
        numberOfDaysInMonth = 30;
        break;
      case 5:
        MonthOfName = "May";
        numberOfDaysInMonth = 31;
        break;
      case 6:
        MonthOfName = "June";
        numberOfDaysInMonth = 30;
        break;
      case 7:
        MonthOfName = "July";
        numberOfDaysInMonth = 31;
        break;
      case 8:
        MonthOfName = "August";
        numberOfDaysInMonth = 30;
        break;
      case 9:
        MonthOfName = "September";
        numberOfDaysInMonth = 30;
        break;
      case 10:
        MonthOfName = "October";
        numberOfDaysInMonth = 31;
        break;
      case 11:
        MonthOfName = "November";
        numberOfDaysInMonth = 30;
        break;
      case 12:
        MonthOfName = "December";
        numberOfDaysInMonth = 31;
        break;

    }
    // if (month == 2 && (year % 4 == 0 && year % 100 > 0 || year % 400 == 0)) {
    // numberOfDaysInMonth = 29;
    // }
    System.out.print(
        MonthOfName + " " + year + " has " + numberOfDaysInMonth + " days\n");
  }
}

