public class App {

    public static int testapp(Weekday day) {
        switch (day) {
            case MONDAY:
                yield 3;
            case THURSDAY, TUESDAY:
                yield 4;
            case WEDNESDAY, FRIDAY:
                yield 5;
            default:
                yield 3;
    }
}
    public static void main(String[] args) throws Exception {
        
        Weekday day = Weekday.MONDAY;
        switch(day) {
            case MONDAY:
            System.out.println("Monday");
            break;
            case TUESDAY:
            System.out.println("Tuesday");
            break;
            case WEDNESDAY:
            System.out.println("Wednesday");
            break;
            case THURSDAY:
            System.out.println("Thursay");
            break;
            // case FRIDAY:
            // System.out.println("Friday");
            // break;
            // missing Friday handling (Syntax OK)
            default:
            
        }
        System.out.println("check");
        System.out.println(App.testapp(day));
        System.out.println("check");
        //After Java 14;
        // - Compile-time -> cross checking (missing enum value or duplicated enum value)
        int value = switch (day) {
            case MONDAY, TUESDAY, THURSDAY -> 3;
            case WEDNESDAY, FRIDAY -> 2;
        };
        System.out.println(value);

        //yield 
        int value2 = switch (day) {
            case MONDAY:
                yield 3;
            case THURSDAY, TUESDAY:
                yield 4;
            case WEDNESDAY, FRIDAY:
                yield 5;
            default:
                yield 3;
        };

        int value3 = switch (day) {
            case MONDAY -> {
                System.out.println("hello");
                yield 3;
            }
            case THURSDAY, TUESDAY -> {
                System.out.println("hello");
                yield 4;
            }
            case WEDNESDAY, FRIDAY -> {
                System.out.println("hello");
                yield 5;
            }
                
            default -> {
                System.out.println("hello");
                yield -1;
            }
                
        };
    }
}
