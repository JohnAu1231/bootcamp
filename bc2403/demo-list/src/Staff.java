import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Staff {

    private String name;

    public Staff(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Staff(" //
        + "name=" + this.name //
        + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this.name)
            return true;
        if (!(obj instanceof Staff))
            return false;
        Staff staff = (Staff) obj;
        return Objects.equals(staff, obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    public static void main(String[] args)  {
       //Set is a data structure that ensure no duplicated elements is stored;
        HashSet<Staff> staffs = new HashSet<>();

        staffs.add(new Staff("Vincent"));
        staffs.add(new Staff("Oscar"));

        System.out.println(staffs.size());
        System.out.println(staffs.isEmpty());
        System.out.println(staffs);

        System.out.println(staffs.add(new Staff("Vincent")));// false
        
        System.out.println(staffs.size());

        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hello");
        System.out.println(strings.size()); //1


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(4);
        integers.add(100);
        integers.add(4);
        integers.add(44);
                
        System.out.println(integers); // [100, 4, 100, 4, 44]
        HashSet<Integer> newHashSet = new HashSet<>();

        for (Integer x : integers) {
            newHashSet.add(x);
        }
        System.out.println(newHashSet); //100,4,44

        newHashSet.remove(new Integer(100));
        System.out.println(newHashSet); //4 ,44

        System.out.println(newHashSet.contains(new Integer(44))); //true


    }
}
