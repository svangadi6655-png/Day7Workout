import java.util.HashMap;
public class Studentmarks {
   public static void main(String[] args) {
    HashMap <String,Integer> hm= new HashMap<>();
    hm.put("abc",87);
    hm.put("efg",98);
    hm.put("mno",67);
    hm.put("uvw",78);
    hm.put("xyz",83);
    for(String name : hm.keySet()) {
    System.out.println(name + " : " + hm.get(name));
        }
   }    
}
