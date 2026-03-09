import java.util.HashSet;
public class CityCheck {
    public static void main(String[] args) {
       HashSet<String> cities = new HashSet<>();
       cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");
if (cities.contains("Delhi")) {
            System.out.println("Delhi exists in the set");
        } else {
            System.out.println("Delhi does not exist in the set");
        }
    }
}