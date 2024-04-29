public class StringPrinter {

  private String data;

  public StringPrinter(String str) {
    this.data = str;
  }

  public void setData(String s) {
    this.data = s;
  }
  
  public void print() {
    System.out.println(this.data);
  }

  public String toString() {
    return "StringPrinter=" //
          + "data=" + data //
          + ")";
  }


  
} 
  
