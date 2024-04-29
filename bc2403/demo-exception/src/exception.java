import java.nio.channels.IllegalSelectorException;

public class exception {
    public static void main(String[] args) {

        // checked exception / compile time exception

        // unchecked exception/ run-time exception
        int total = 0;
        try {
            total = totalSalary(new int[] {100, -10, 45}); // java.lang.IllegalArgumentException
        } catch (IllegalArgumentException e) {
            total = 0;
        }
        System.out.println("total=" + total);

        int x = 0;
        int r = 0;
        try {
            r = 8 / x;
        } catch (ArithmeticException e) {
            r = 0;
        }
        System.out.println("r=" + r);

        // int r = x == 0? 0 : 8/x;
        // int r2 = 8 / x; // java.lang.ArithmeticException; / by zero
        try {
            getString(new char[] {'c', 'a', 't'}, -2, 2); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        //4. NullPointerException
        String s = "hello";
        s = null;
        //solution1 (not suggest)
        try {
            System.out.println(s.charAt(0));
        } catch (NullPointerException e) {
            // what to do???
        }
        // solution2 
        if (s != null)
            System.out.println(s.charAt(0));

        //5. StringIndexOutOfBoundsException
        String s2 = "hello";
        try {
            System.out.println(s2.charAt(0));
        } catch (StringIndexOutOfBoundsException e) {
            
        }

        //6. IllegalStateException
        int n1 = 7;
        int n2 = 8;
        try {
        // if(n1 + n2 > 0)
        //     System.out.println("it is correct state");
        // else 
        //     throw new IllegalStateException();
        checkParameters(n1, n2);
        } catch (IllegalStateException e) {
            System.out.println("Handled the IllegalStateException");
        }

        //7 NumberFormatException
        try {
        int num = Integer.parseInt("10s");
        } catch (NumberFormatException e) {
            System.out.println("Handled the NumberFormatException");
        }
        
    }

    public static int totalSalary(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            if (x < 0)
                throw new IllegalArgumentException(); // an error event
            sum += x;
        }
        return sum;
    }

    // ArrayIndexOutOfBoundsException
    public static String getString(char[] characters, int beginIdx, int endIdx) {
            StringBuilder sb = new StringBuilder();
            for (int i = beginIdx; i < endIdx; i++) {
                sb.append(characters[i]);
            }
            return sb.toString();
        }

        public static void checkParameters(int n1, int n2) {
            if(n1 + n2 > 0)
            System.out.println("it is correct state");
        else 
            throw new IllegalStateException();
        }
}
