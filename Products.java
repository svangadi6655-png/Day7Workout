import java.util.LinkedHashMap;
public class Products {
    public static void main(String[] args) {
        LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
        lhm.put("laptop","56000");
        lhm.put("mobile","25000");
        lhm.put("airbuds","1200");
        lhm.put("shoes","600");
        lhm.put("watch","6000");
        System.out.println(lhm);
    }
}
