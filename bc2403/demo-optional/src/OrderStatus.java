import java.util.Arrays;

public enum OrderStatus {
  CONFIRMED(1, "Ordered."), //
  PAID(2, "Paid."), //
  READY_TO_SHIP(3, "Ready to ship."), //
  DELIVERED(4, "Delivered."), //
  ;


  private final int code;

  private final String desc;

  private OrderStatus(int code, String desc) {
    this.code =code;
    this.desc =desc;
  }

  public int getCode() {
    return this.code;
  }

  public String getDesc() {
    return this.desc;
  }

  //Araay.stream() = Arrays -> stream
  public static OrderStatus get(int code) {
    return Arrays.stream(values()) //
    .filter(e -> e.getCode() == 2) //
    .findFirst() //
    .orElseThrow(() -> new IllegalArgumentException());
  }
}
