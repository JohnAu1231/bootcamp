public class Shoe {

  private float size;
  private String color;
  private String type;
  private String brand;

  //setter
  public void setSize(float size) {
    this.size = size;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
  public void setType(String type) {
    this.type = type;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  //getter
  public float getSize() {
    return this.size;
  }

  public String getColor() {
    return this.color;
  }

  public String getType() {
    return this.type;
  }

  public String getBrand() {
    return this.brand;
  }

  //method
  public String toString() {
    return "Shoe(" //
    + "size=" + this.size //
    + ", color=" + this.color //
    + ", type=" + this.type //
    + ", brand=" + this.brand //
    + ")";
  }

  public static void main(String[] args) {
    Shoe samba = new Shoe();
    samba.setSize(8.0f);
    samba.setColor("RED");
    samba.setType("SportWear");
    samba.setBrand("Adidas");
    System.out.println(samba.toString());
  }
}
