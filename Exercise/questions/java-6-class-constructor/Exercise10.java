/**
 * Expected Output: 8
 */
public class Exercise10 {
    public int x; // Create an instance attribute

    // Create a class constructor for the Main class
    public Exercise10(int num) {
        // Set the value for the instance attribute x to expected output
        this.x = num;
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of this class Exercise10
        Exercise10 ans = new Exercise10(8);
        // Print the value of instance attribute
        System.out.println(ans.x);
    }
}
