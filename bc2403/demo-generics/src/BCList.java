public class BCList<T extends Number> {
  
  private T data1;

  private T data2;

  public BCList(T data1, T data2) {
    this.data1 = data1;
    this.data2 = data2;
  }

  public void setData1(T data1) {
    this.data1 = data1;
  }

  public void setData2(T data2) {
    this.data2 = data2;
  }

  public T getData1() {
    return this.data1;
  }

  public T getData2() {
    return this.data2;
  }

  public  static <T extends Number> double sum(T number1, T number2) { 
    // no relation ship with class T, this T is independent, static method !!!
    System.out.println(number1.getClass());
    System.out.println(number2.getClass());
    return number1.doubleValue() + number2.doubleValue();

  }

  public static void main(String[] args) {
    
    //T and U can be same type or different type
    // BCList<String, Integer> bclist = new BCList<>("str", 12);
    // System.out.println(bclist.getData1());
    // System.out.println(bclist.getData2());

    // //T and T must be same type
    // BCList<String, String> bclist2 = new BCList<>("str", "world");
    // System.out.println(bclist2.getData1());
    // System.out.println(bclist2.getData2());

    BCList<Integer, Integer> bclist2 = new BCList<>(Integer.valueOf(13), Integer.valueOf(13));
    System.out.println(bclist2.getData1());
    System.out.println(bclist2.getData2());

    sum(Integer.valueOf(13), Long.valueOf(10));
    
  }
}
