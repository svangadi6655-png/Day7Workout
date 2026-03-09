import java.util.HashMap;
public class Hashmap{
    public static void main(String[] args) {
        HashMap <String,String> hm=new HashMap<>();
        hm.put("name","abc");
        hm.put("college","tce");
        hm.put("grade","A");
        hm.put("dept","CSE");
        System.out.println(hm);
        System.out.println( hm.get("name"));
        System.out.println(hm.size());
        hm.remove("college");
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);
    }
}