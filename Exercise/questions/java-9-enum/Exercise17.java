

enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int value;

    Level(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }


/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;//Level.HIGH;//Level.LOW;

        switch(myVar) {
        case LOW:
            System.out.println("This is Low Level");
            System.out.println("enum is " + Level.LOW + ", and its value is " + myVar.getValue());
            break;
        case MEDIUM:
            System.out.println("This is Medium Level");
            System.out.println("enums is " + Level.MEDIUM + ", and its value is " + myVar.getValue());
            break;
        case HIGH:
            System.out.println("This is High Level");
            System.out.println("enum is " + Level.HIGH + ", and its value is " + myVar.getValue());
            
        }

        }
    }
}