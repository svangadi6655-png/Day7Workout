import java.util.TreeMap;
public class Treemap{
    public static void main(String[] args) {
        TreeMap <String,String> tm=new TreeMap<>();
        tm.put("name","abc");
        tm.put("college","tce");
        tm.put("grade","A");
        tm.put("dept","CSE");
        System.out.println(tm);
        System.out.println( tm.get("name"));
        System.out.println(tm.size());
        tm.remove("college");
        System.out.println(tm);
        tm.clear();
        System.out.println(tm);
    }
}