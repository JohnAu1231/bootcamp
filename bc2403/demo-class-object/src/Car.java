public class Car {

    // Attributes
    private String color; // "RED" , "YELLOW", "BLACK" ......

    private double speed;

    private int capacity;

    private boolean isOverSpeed;  // not raw data, no need, useless -> we should use speed to derive isOverSpeed()
    // ...

    // behavior or instance methods
    // Setter
    public void setColor(String x) {
        this.color = x;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        if (speed > 90) 
            this.isOverSpeed = true;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Getter
    public String getColor() {
        return this.color;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isOverSpeed() {
        return this.isOverSpeed;
    }

    public String toString() {
        return "Car(" //
        + "color=" + this.color //
        + ", speed=" + this.speed //
        + ", capacity=" + this.capacity //
        + ")";
    }


    public static void main(String[] args) {
        Car c = new Car(); // c-> object reference
        c.setColor("RED");
        c.setSpeed(78.5d);
        c.setCapacity(4);
        System.out.println(c.getColor()); // RED
        System.out.println(c.getSpeed());
        System.out.println(c.getCapacity());
        System.out.println(c.isOverSpeed());

        Car d = new Car();
        d.setColor("Yellow");
        d.setSpeed(90.5d);
        d.setCapacity(2);
        System.out.println("Color: " + d.getColor() +", Speed: " + d.getSpeed() + ", Capacity: " + d.getCapacity());
        System.out.println(d.isOverSpeed());
        System.out.println(d.toString());
    }



}

