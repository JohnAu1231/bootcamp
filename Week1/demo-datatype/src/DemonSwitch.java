
public class DemonSwitch {
  public static void main(String[] args) {

    char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("This is grade A"); // fullfill A,then all = ture, if no break
        break; // break = stop the switch
      case 'B':
        System.out.println("This is grade B");
        break;
      case 'C':
        System.out.println("This is grade C");
        break;
      default:
        System.out.println("Default Value");
    }
    /* Grade A:5 B:4 C:3 D:2 E:1 F:0 */
    int score = 0;
    grade = 'B';
    switch (grade) {
      case 'A':
        score++;
      case 'B':
        score++;
      case 'C':
        score++;
      case 'D':
        score++;
      case 'E':
        score++;
      default:
        System.out.println(grade + ":" + score);
    }

    //Switch (cannot)
    //case () cannot compare value, only inclue value in ()
  }
}
