import javax.print.DocFlavor.CHAR_ARRAY;

public class StringBox implements CharSequence {
  
  private char[] characters;

  public StringBox(String str ) {
    this.characters = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      this.characters[i] = str.charAt(i);
    }
  }

  @Override
  public char charAt(int index) {
    return this.characters[index];
  }

  @Override 
  public int length() {
    return this.characters.length;
  }

  @Override
  public CharSequence subSequence(int beginIndex, int endIndex) {
    StringBuilder sb = new StringBuilder();
    for (int i = beginIndex; i < endIndex - 1; i++) {
      sb.append(this.characters[i]);
    }
    return sb;
  }

  public static int ascii(CharSequence cs, int index) {
    return cs.charAt(index);
  }

  public static void main(String[] args) {
    
    CharSequence cs = new StringBox("hello");
    System.out.println(cs.charAt(1));

    CharSequence cs2 = new String("hello"); // cs2 using CharSequence class
    cs2.charAt(0);

    CharSequence cs3 = new StringBuilder("hello");
    cs3.charAt(0);

    System.out.println(ascii(cs2, 2));
    System.out.println(ascii(cs3,2));
    System.out.println(ascii(cs,2));

  }
}
