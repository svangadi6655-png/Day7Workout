import java.util.HashSet;
public class UniqueProduct {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(101);
        set.add(102);
        set.add(103);
        set.add(101);
        set.add(104);
         for (int id : set) {
            System.out.print(id + " ");
        }
    }
}