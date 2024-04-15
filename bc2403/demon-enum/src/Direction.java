public enum Direction { // class : run java program, JVM new 4 objects of Ditection, before the class loading, before main


    // Finite number of values
    EAST(1, 'E'), //
    SOUTH(2, 'S'),//
    WEST(-1, 'W'), //
    NORTH(-2, 'N'), //

    ;

    // private final int value; design no need change the value; final it 
    private int value;

    private char firstChar;

    // private Direction() // can provide private constructor //because it used by JVM

    private Direction(int value, char firstChar) {
        this.value = value;
        this.firstChar = firstChar;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public char getChar() {
        return this.firstChar;
    }

    public Direction oppsite() {
        for (Direction d : Direction.values()) {
            if (this.value * -1 == d.getValue())
            return d;
        }
        return null;
    }

    public static Direction oppsite(Direction direction) {
        if (direction == null)
            return null;
        for (Direction d : Direction.values()) {
            if (direction.getValue() * -1 == d.getValue())
                return d;
        }
        return null;
    }
    // You cannnot create Direction object by yourself;

    public static void main(String[] args) {

        // check if the direction is EAST?
        House house = new House(Direction.EAST);
        house.setDirection(Direction.NORTH);

        System.out.println(house.getDirection() == Direction.EAST); // true
        Direction.NORTH.setValue(100);
        System.out.println(Direction.NORTH.getValue()); // 4
        System.out.println(Direction.NORTH.getChar()); // N
        House houseA = new House(Direction.EAST);
        System.out.println(houseA.getDirection().oppsite().name());

        Direction direction = Direction.NORTH;
        int degree = getDirectionDegree(direction);
        System.out.println("degree= "  + degree);

    }

    public static int getDirectionDegree(Direction direction) {
        switch (direction) {
            case NORTH:
                return 360;
            case EAST:
                return 90;
            case SOUTH:
                return 180;
            case WEST:
                return 270;
            default:
                return -1;
        }
        
    }
}
