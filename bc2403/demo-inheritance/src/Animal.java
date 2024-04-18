public class Animal {

    private String name;

    public static String x = "abc";

    private int ears;
    
    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void sleep(){
        System.out.print("sleep");
    }
}
