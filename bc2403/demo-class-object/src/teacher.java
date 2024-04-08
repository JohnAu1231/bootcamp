public class teacher {

  private String[] subject;
  
  private int maxClass;

  public void setSubject(String[] subject) {
    this.subject = subject;
  }

  public void setMaxClass(int maxClass) {
    this.maxClass = maxClass;
  }

  public String[] getSubject() {
    return this.subject;
  }

  public int getMaxClass() {
    return this.maxClass;
  }

  public static void main(String[] args) {

    int dayLesson = 8;
    int[] dayAClassA = new int[dayLesson];
    int[] dayAClassB = new int[dayLesson];
    teacher teacherA = new teacher();
    teacherA.setSubject(new String[] {"Math", "Eng"});

    teacher teacherB = new teacher();
    teacherB.setSubject(new String[] {"Chi", "Eng"});

    teacher teacherC = new teacher();
    teacherC.setSubject(new String[] {"Math", "Eng", "Chi"});
  }
}
