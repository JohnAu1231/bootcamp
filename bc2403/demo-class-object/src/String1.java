public class String1 {

  // Attributes (descripition)
  private char[] characters;

  // empty constructor (Implicity exists)
  public String1() {
    this.characters = new char[0];
  }
  public String1(String s) {
    this.characters = new char[s.length()];
    for(int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
  }
}
  // instance methods
  public void setValue(String s) {
    this.characters = new char[s.length()];
    for(int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }
  }
  public String concat1(String s) {
    char[] newArr = new char[s.length() + this.characters.length];
    int idx = 0;
    for (int i = 0; i < this.characters.length; i++) {
      newArr[idx++] = this.characters[i];
    }
    for (int i = 0; i < s.length(); i++) {
      newArr[idx++] = s.charAt(i);
    }
    return String.valueOf(newArr);
  }

  public void concat2 (String s) {
    char[] tempArr = this.characters;
    this.characters = new char[s.length() + this.characters.length];
    int idx = 0;
    for (int i = 0; i < tempArr.length; i++) {
      this.characters[idx++] = tempArr[i];
    }
    for (int i = 0; i < s.length(); i++) {
      this.characters[idx++] = s.charAt(i);
    }
  }
  public void clear() {
    this.characters = new char[0];
  }

  // instance methods
  public String getValue() {
    String ans = "";
    for (int i = 0; i < this.characters.length; i++) {
      ans = ans.concat(String.valueOf(this.characters[i]));
    }
    return ans;

  }

  public String toString() {
    String ans = "";
    for (int i = 0; i < this.characters.length; i++) {
      ans = ans.concat(String.valueOf(this.characters[i]));
    }
    return ans;
  }

  public static void main(String[] avgs) {
    String1 str = new String1();
    System.out.println(str.getValue());
    str.setValue("cde");
    System.out.println(str.getValue());
    String b = str.concat1("aaa");
    System.out.println(b);
    String1 str2 = new String1("abc");
    System.out.println(str2.getValue());
    str2.clear();
    System.out.println(str2); // by default calling toString() method // abc
    str.concat1("sss");
    System.out.println(str);
    String1 str3 = new String1("hello");
    String result = str3.concat1("world");
    System.out.println(str3);
    System.out.println(result);
    str3.concat2("John");
    System.out.println(str3);
    
    
    

  }
}
